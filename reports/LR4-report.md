# Отчёт по лабораторной работе №4
## Мультиплатформенный GoogleTest

### Среда
C++17, CMake, GoogleTest 1.14.0.

### Выполнено
Созданы библиотека калькулятора, заголовочный файл, тесты GoogleTest и конфигурация CMake с `FetchContent`. Проверяются обычные значения, граница со знаками, погрешность деления и исключение.

### Запуск
```bash
cmake -S LR4-GoogleTest -B LR4-GoogleTest/build
cmake --build LR4-GoogleTest/build
ctest --test-dir LR4-GoogleTest/build --output-on-failure
```

### Результат
Production-код дополнительно скомпилирован локально `g++ -std=c++17`. C++ job GitHub Actions успешно завершился для `cd31448`.

### Вывод
Проект собирается переносимым способом через CMake и не зависит от конкретной IDE.
