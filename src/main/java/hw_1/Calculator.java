package hw_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double calculateDiscount(double amount, int discount){
        if (discount > 100 || discount < 0){
            throw new ArithmeticException("The discount must be greater than or equal to 0% and less than " +
                    "or equal to 100%");
        }
        else if (amount < 0){
            throw new ArithmeticException("The purchase amount must be greater than 0");
        }
        return amount - (amount * discount / 100);
    }
}