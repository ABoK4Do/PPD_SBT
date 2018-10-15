package ru.study.lecture3;

import org.junit.Test;
import ru.study.task2.Circle;

import static org.junit.Assert.assertEquals;

public class TestShapeUtils {

    @Test
    public void testMaxReturnsMaxFigure(){
        Circle smallCircle = new Circle(5);
        Circle bigCircle = new Circle(10);
        assertEquals(bigCircle, ShapeUtils.max(smallCircle, bigCircle));
    }
    @Test
    public void testMaxReturnsMaxFigureWhenAnotherPlaceOfArguments(){
        Circle smallCircle = new Circle(5);
        Circle bigCircle = new Circle(10);
        assertEquals(bigCircle, ShapeUtils.max(bigCircle, smallCircle));
    }
}
