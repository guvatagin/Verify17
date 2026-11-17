using Microsoft.VisualStudio.TestTools.UnitTesting;
using Verify17.LR3;
namespace Verify17.LR3.Tests;
[TestClass] public class ArithmeticCalculatorTests {
    private ArithmeticCalculator calculator = null!;
    [TestInitialize] public void SetUp() => calculator = new();
    [TestMethod] public void Add_ReturnsSum() => Assert.AreEqual(4, calculator.Add(2, 2), 1e-9);
    [TestMethod] public void Divide_ReturnsApproximateResult() => Assert.AreEqual(3.333333, calculator.Divide(10, 3), 1e-6);
    [TestMethod] public void DivideByZero_Throws() => Assert.ThrowsException<ArgumentException>(() => calculator.Divide(1, 0));
}
