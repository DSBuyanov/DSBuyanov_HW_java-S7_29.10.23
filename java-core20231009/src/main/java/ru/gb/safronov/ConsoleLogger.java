package ru.gb.safronov;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
    }
}
