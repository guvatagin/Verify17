package edu.student;
public final class Calculator {
    public double add(double a, double b) { return a + b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { if (b == 0) throw new IllegalArgumentException("zero divisor"); return a / b; }
}
