package ru.study.task2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        return Math.PI * radius * radius;
    }
}
