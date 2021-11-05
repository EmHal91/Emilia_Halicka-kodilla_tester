package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.getSum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda getSum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda getSum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int substractResult = calculator.getSubstract(a, b);
        boolean ok = ResultChecker.assertEquals(-3, substractResult);
        if (ok) {
            System.out.println("Metoda getSubstract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda getSubstract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squareResult = calculator.getSquareNumber1(a);
        boolean well = ResultChecker.assertEquals(25, squareResult);
        if (well) {
            System.out.println("Metoda getSquareNumber1 działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda getSquareNumber1 nie działa poprawnie dla liczby " + a);
        }
        int getResult = calculator.getSquareNumber2(b);
        boolean right = ResultChecker.assertEquals(64, getResult);
        if (right) {
            System.out.println("Metoda getSquareNumber2 działa poprawnie dla liczby " + b);
        } else {
            System.out.println("Metoda getSquareNumber2 nie działa poprawnie dla liczby " + b);
        }
    }
}
