namespace Verify17.LR3;
public sealed class ArithmeticCalculator {
    public double Add(double a, double b) => a + b;
    public double Divide(double a, double b) {
        if (b == 0) throw new ArgumentException("Cannot divide by zero", nameof(b));
        return a / b;
    }
}
