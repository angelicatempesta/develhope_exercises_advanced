package _7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.add(10, 10) == 20);
        Assertions.assertTrue(calculator.add(-10, -10) == -20);
        Assertions.assertTrue(calculator.add(0, 0) == 0);
        Assertions.assertTrue(calculator.subtract(10, 5) == 5);
        Assertions.assertTrue(calculator.subtract(-10, -5) == -5);
        Assertions.assertTrue(calculator.subtract(0, 0) == 0);/// Your code here
    }


    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        Assertions.assertTrue(calculator.multiply(10, 10) == 100);
        Assertions.assertTrue(calculator.multiply(-10, -10) == 100);
        Assertions.assertTrue(calculator.multiply(0, 0) == 0);
        Assertions.assertTrue(calculator.divide(10, 5) == 2);
        Assertions.assertTrue(calculator.divide(-10, -5) == 2);
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.power(0, 2) == 0);
        Assertions.assertTrue(calculator.power(2, 2) == 4);
        Assertions.assertTrue(calculator.power(-2, 2) == 4);
        Assertions.assertTrue(calculator.power(2, 0) == 1);
        Assertions.assertTrue(calculator.power(2, 1) == 2);
        Assertions.assertTrue(calculator.power(4, -2) == 0.0625);
        Assertions.assertTrue(calculator.power(4.50, 2) == 20.25);
        Assertions.assertTrue(calculator.power(4, 2.50) == 32);
        // Your code here
    }
}