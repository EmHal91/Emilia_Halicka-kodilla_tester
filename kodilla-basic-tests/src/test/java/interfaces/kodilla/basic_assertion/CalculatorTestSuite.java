package interfaces.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.getSum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.getSubstract(a, b);
        assertEquals(-3, sumResult);
    }

    @Test
    public void testSquare_0() {
        Calculator calculator = new Calculator();
        int a = 0;
        int sumResult = calculator.getSquareNumber1(a);
        assertEquals(0, sumResult, 0.1);
    }

    @Test
    public void testSquare_4() {
        Calculator calculator = new Calculator();
        int a = 4;
        int sumResult = calculator.getSquareNumber1(a);
        assertEquals(16, sumResult, 0.1);
    }

    @Test
    public void testSquare_minus() {
        Calculator calculator = new Calculator();
        int a = -2;
        int sumResult = calculator.getSquareNumber1(a);
        assertEquals(4, sumResult, 0.1);
    }
}
