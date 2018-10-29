package ru.study.task2;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int)(o1.getArea() - o2.getArea());
    }
}
