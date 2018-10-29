package ru.study.task2;

public class Rectangle extends Shape{
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        return a * b;
    }
}
