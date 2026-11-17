using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.WaitHelpers;
namespace Verify17.LR8;
[TestFixture] public sealed class LoginTests {
 private IWebDriver driver = null!; private WebDriverWait wait = null!;
 [SetUp] public void SetUp() { var options = new ChromeOptions(); options.AddArgument("--headless=new"); driver = new ChromeDriver(options); wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10)); }
 [TearDown] public void TearDown() { driver.Quit(); driver.Dispose(); }
 [Test] public void InvalidPasswordShowsError() {
  driver.Navigate().GoToUrl("http://localhost:8080/login");
  driver.FindElement(By.Id("inputEmail")).SendKeys("test@example.com");
  driver.FindElement(By.Id("inputPassword")).SendKeys("wrong-password");
  driver.FindElement(By.CssSelector("button[type='submit']")).Click();
  var error = wait.Until(ExpectedConditions.ElementIsVisible(By.Id("login-error")));
  Assert.That(error.Text, Does.Contain("Invalid credentials"));
 }
}
