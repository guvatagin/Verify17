package edu.student;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorSteps {
 private Calculator calculator; private double first; private double second; private double result;
 @Given("I have a software calculator") public void create() { calculator = new Calculator(); }
 @When("I enter {double} as the first operand") public void first(double value) { first = value; }
 @When("I enter {double} as the second operand") public void second(double value) { second = value; }
 @When("I press {string}") public void press(String operation) { if (!operation.equals("Add")) throw new IllegalArgumentException("Unsupported operation"); result = calculator.add(first, second); }
 @Then("the result should be {double}") public void verify(double expected) { assertEquals(expected, result, 1e-9); }
}
