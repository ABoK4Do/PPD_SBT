package ru.study.task2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square() {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        return Math.PI * radius * radius;
    }
}
