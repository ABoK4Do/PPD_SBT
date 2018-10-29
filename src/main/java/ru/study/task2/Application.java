package ru.study.task2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> testList = new LinkedList<>();
        testList.add(new Circle(1.5));
        testList.add(new Rectangle(1, 2));
        testList.add(new Square(4));
        for(Shape shape: testList){
            System.out.println(shape.getArea());
        }
        System.out.println("<Sorted>");
        Collections.sort(testList, new ShapeComparator());
        for(Shape shape: testList){
            System.out.println(shape.getArea());
        }
    }

}
