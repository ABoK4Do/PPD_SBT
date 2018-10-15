package ru.study.lecture3;

import ru.study.task2.Circle;

public class ShapeUtils {
    public static Circle max(Circle circle1, Circle circle2) {
        if (circle1.square() >= circle2.square()) {
            return circle1;
        } else return circle2;
    }
}
