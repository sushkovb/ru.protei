# Проект по автоматизации тестирования HTML-файла

## Содержание

> ➠ [Покрытый функционал](#earth_africa-покрытый-функционал)
>
> ➠ [Технологический стек](#classical_building-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)

## Покрытый функционал

> Разработаны автотесты на <code>UI</code> локального HTML-файла.
### UI

- [x] Проверка формы авторизации
- [x] Проверка заполнения анкеты


## Технологический стек

<p>
  <img src="https://img.icons8.com/color/48/000000/intellij-idea.png" title="Intellij Idea" alt="Intellij Idea" width="40" height="40"/>&nbsp; 
  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original-wordmark.svg" title="Java" alt="Java" width="40" height="40"/>&nbsp;
  <img src="https://plugins.gradle.org/shared-assets/shared/images/elephant-corner.png" title="Gradle"  alt="Gradle" width="40" height="40"/>&nbsp;
  <img src="https://img.icons8.com/glyph-neue/344/github.png" title="GitHub" alt="GitHub" width="40" height="40"/>&nbsp;
  <img src="https://miro.medium.com/max/1400/1*J8sjpKQJswCKiPUYVefbgQ.jpeg" title="JUnit 5" alt="JUnit 5" width="70" height="40"/>&nbsp;
  <img src="https://images.opencollective.com/allure-report/f14e715/logo/256.png" title="Allure" alt="Allure" width="40" height="40"/>&nbsp;
  <img src="https://avatars.githubusercontent.com/u/26328913?s=400&v=4" title="Selenoid" alt="Selenoid" width="50" height="40"/>&nbsp;
  </p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.


## Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```
### Формирование отчета Allure

```
 ./gradlew allureServe
```


### Главная страница Allure-отчета

<p>
<a href="https://ibb.co/V9C50qM"><img src="https://i.ibb.co/qjgVLrm/11.png" alt="11" border="0"></a>
</p>

### Группировка тестов по проверяемому функционалу

<p>
<a href="https://ibb.co/2W60zvs"><img src="https://i.ibb.co/MZhyzcG/22.png" alt="22" border="0"></a>
</p>


### Основной дашборд

<p>
<a href="https://ibb.co/GM2z2Tg"><img src="https://i.ibb.co/myqfq8Q/33.png" alt="33" border="0"></a>
</p>

