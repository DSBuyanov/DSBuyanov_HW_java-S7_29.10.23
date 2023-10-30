package ru.gb.safronov;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber num1 = new ComplexNumber(2, 1);
        ComplexNumber num2 = new ComplexNumber(4, 3);

        ComplexOperation addOperation = new Addition();
        ComplexNumber result = calculator.performOperation(addOperation, num1, num2);

        // Вывод результата
        System.out.println("Result of addition: " + result);
    }
}