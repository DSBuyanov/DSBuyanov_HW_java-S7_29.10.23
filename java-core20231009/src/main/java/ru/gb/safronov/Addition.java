package ru.gb.safronov;


public class Addition implements ComplexOperation {
    public ComplexNumber perform(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }
}
