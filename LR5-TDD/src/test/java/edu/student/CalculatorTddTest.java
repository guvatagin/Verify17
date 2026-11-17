package edu.student;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculatorTddTest {
 @Test void calculatorCanBeCreated() { assertNotNull(new Calculator()); }
 @Test void addTwoNumbers() { assertEquals(4, new Calculator().add(2, 2)); }
 @Test void multiplyTwoNumbers() { assertEquals(6, new Calculator().multiply(2, 3)); }
 @Test void divideByZeroIsRejected() { assertThrows(IllegalArgumentException.class, () -> new Calculator().divide(1, 0)); }
}
