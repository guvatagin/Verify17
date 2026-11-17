# ЛР8. Selenium IDE и WebDriver

Selenium IDE сценарий:

```text
open /login
type id=inputEmail test@example.com
type id=inputPassword wrong-password
click css=button[type='submit']
assertElementPresent id=login-error
```

WebDriver тест находится в `LoginTests.cs`.

```bash
dotnet test Selenium.Tests.csproj
```

Перед запуском поднимите локальное тестовое web-приложение на `http://localhost:8080`. Для успешного входа дополнительно проверить профиль и затем выполнить logout. Постусловие создания записи должно быть проверено в интерфейсе и в тестовом API/файле/БД.
