package edu.student;
/** Базовые арифметические операции. */
public final class Calculator {
    public double add(double a, double b) { return a + b; }
    public double divide(double a, double b) {
        if (b == 0.0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }
}
