package ru.study.task2;

public class Circle {
    public static double square(double r) {
        if (r < 0) {
            throw new NumberFormatException();
        }
        return Math.PI * r * r;
    }
}
