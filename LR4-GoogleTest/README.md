# ЛР4. Мультиплатформенный фреймворк GoogleTest

```bash
cmake -S . -B build
cmake --build build
ctest --test-dir build --output-on-failure
```

CMake и GoogleTest позволяют запускать один набор тестов в разных ОС и IDE.
