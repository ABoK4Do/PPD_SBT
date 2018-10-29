package ru.study.task2;

public class Square extends Shape{
    private double a;

    Square(double a){
        this.a = a;
    }

    @Override
    public double getArea() {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        return a * a;
    }
}
