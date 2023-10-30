package ru.gb.safronov;

// Interface
interface ComplexOperation {
    ComplexNumber perform(ComplexNumber a, ComplexNumber b);
}

public class ComplexCalculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber performOperation(ComplexOperation operation, ComplexNumber a, ComplexNumber b) {
        if (logger != null) {
            logger.log("Performing operation...");
        }
        return operation.perform(a, b);
    }
}
