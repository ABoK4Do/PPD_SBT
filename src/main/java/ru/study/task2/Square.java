package ru.study.task2;

public class Square {
    private double a;

    Square(double a){
        this.a = a;
    }

    public double square() {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        return a * a;
    }
}
