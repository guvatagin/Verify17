# Verify17 — лабораторные работы по тестированию

Репозиторий содержит ЛР1–ЛР8 по методичке С. М. Старолетова.

| Работа | Содержание | Запуск |
|---|---|---|
| LR1 | GitHub, спецификация, black-box | документация |
| LR2 | Java/JUnit 5 | `cd LR2-JUnit && mvn test` |
| LR3 | .NET/MSTest | `dotnet test LR3-DotNet/Calculator.Tests.csproj` |
| LR4 | C++/GoogleTest/CMake | `cmake -S LR4-GoogleTest -B build && cmake --build build && ctest --test-dir build` |
| LR5 | TDD | `cd LR5-TDD && mvn test` |
| LR6 | BDD/Cucumber | `cd LR6-BDD && mvn test` |
| LR7 | IBM Rational Functional Tester | сценарии и datapool в `LR7-RFT` |
| LR8 | Selenium IDE/WebDriver | `dotnet test LR8-Selenium` |

Рабочая ветка: `student/guvatagin-labs`.
