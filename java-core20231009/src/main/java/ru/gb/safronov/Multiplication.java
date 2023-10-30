package ru.gb.safronov;

// multiplication
public class Multiplication implements ComplexOperation {
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }
}
