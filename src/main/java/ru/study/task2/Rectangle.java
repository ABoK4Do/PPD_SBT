package ru.study.task2;

public class Rectangle {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double square() {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        return a * b;
    }
}
