# Отчёт по лабораторной работе №3
## Модульное тестирование .NET с MSTest

### Среда
.NET 8, MSTest, Microsoft.NET.Test.Sdk.

### Выполнено
Production-проект расположен в `LR3-DotNet/src`, тестовый проект — в `LR3-DotNet/tests/Calculator.Tests`. Проверяются сложение, деление с погрешностью и исключение при нулевом делителе. Для устранения конфликтов SDK исходные и тестовые файлы разделены по каталогам.

### Запуск
```bash
dotnet test LR3-DotNet/tests/Calculator.Tests/Calculator.Tests.csproj
```

### Результат
После исправления структуры проект успешно прошёл .NET job в GitHub Actions для коммита `cd31448`.

### Вывод
Тестовый проект имеет собственные MSTest-зависимости и ссылку на production-проект.
