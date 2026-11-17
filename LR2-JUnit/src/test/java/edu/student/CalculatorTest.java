package edu.student;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.*;
class CalculatorTest {
    private Calculator calculator;
    @BeforeEach void setUp() { calculator = new Calculator(); }
    @Test void addNumbers() { assertEquals(5.0, calculator.add(2, 3), 1e-9); }
    @Test void addNegativeAndPositive() { assertEquals(0.0, calculator.add(-2, 2), 1e-9); }
    @Test void divideWithTolerance() { assertEquals(3.333333, calculator.divide(10, 3), 1e-6); }
    @Test void divideByZeroThrows() {
        var e = assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", e.getMessage());
    }
    @Test void operationCompletesInTime() {
        assertTimeout(Duration.ofMillis(100), () -> assertEquals(4, calculator.add(2, 2)));
    }
}
