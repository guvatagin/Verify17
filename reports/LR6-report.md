# Отчёт по лабораторной работе №6
## Разработка, управляемая поведением (BDD)

### Среда
Java 17, Maven, Cucumber 7.15.0, JUnit Platform.

### Выполнено
Поведение калькулятора описано на Gherkin в `src/test/resources/features/calculator.feature`. Добавлены step definitions, runner JUnit Platform и реализация операции сложения.

### Запуск
```bash
cd LR6-BDD
mvn clean test
```

### Результат
BDD-сценарии входят в Java job GitHub Actions, который успешно завершился для `cd31448`.

### Вывод
Поведение задано в форме, читаемой заказчиком, а Java-код связывает Given/When/Then с реализацией.
