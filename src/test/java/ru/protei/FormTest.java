package ru.protei;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class FormTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    @DisplayName("Тест на авторизацию")
    void authTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        String path = "file:" + new File(System.getProperty("user.dir"),
                "src/test/resources/qa-test.html").getAbsolutePath();

        step("Открываем HTML-файл", () -> open(path));

        step("Вводим логин и пароль", () -> {
            $("#loginEmail").setValue("test@protei.ru");
            $("#loginPassword").setValue("test");
            $("#authButton").click();
        });

        step("Открывается форма для заполнения", () -> {
            $("#inputsPage").shouldBe(visible);
            Allure.getLifecycle().addAttachment(
                    "Исходники страницы",
                    "text/html",
                    "html",
                    WebDriverRunner.getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8)
            );
        });
    }

    @Test
    @DisplayName("Тест на заполнение формы")
    void fillFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        String path = "file:" + new File(System.getProperty("user.dir"),
                "src/test/resources/qa-test.html").getAbsolutePath();

        step("Открываем HTML-файл", () -> open(path));

        step("Вводим логин и пароль", () -> {
            $("#loginEmail").setValue("test@protei.ru");
            $("#loginPassword").setValue("test");
            $("#authButton").click();
        });

        step("Вводим данные в форму", () -> {
            $("#dataEmail").setValue("test@protei.ru");
            $("#dataName").setValue("Boris");
            $("#dataGender").selectOption("Женский");
            $("#dataCheck11").click();
            $("#dataCheck12").click();
            $("#dataSelect23").click();
        });

        step("Появление формы 'Данные добавлены'", () -> {
            $("#dataSend").click();
            $(".uk-modal-dialog").shouldHave(text("Данные добавлены."));
            Allure.getLifecycle().addAttachment(
                    "Исходники страницы",
                    "text/html",
                    "html",
                    WebDriverRunner.getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8)
            );
        });

        step("Проверка соответствия данных, введенных из формы", () -> {
            $(byText("Ok")).click();
            $("thead").shouldHave(text("E-Mail"), text("Имя"),
                    text("Пол"), text("Выбор 1"), text("Выбор 2"));
            $("tbody").shouldHave(text("test@protei.ru"), text("Boris"),
                    text("Женский"), text("1.1, 1.2"), text("2.3"));
            Allure.getLifecycle().addAttachment(
                    "Исходники страницы",
                    "text/html",
                    "html",
                    WebDriverRunner.getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8)
            );
        });
    }
}