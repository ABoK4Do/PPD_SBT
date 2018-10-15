package ru.study.task2;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
    @Test
    public void testSquare_double() {
        Assert.assertEquals(2.5 * 2.5, Square.square(2.5), 0.0001);
    }

    @Test
    public void testSquare_int() {
        Assert.assertEquals(2 * 2, Square.square(2), 0.0001);
    }

    @Test
    public void testSquare_zero() {
        Assert.assertEquals(0, Square.square(0), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testSquare_throw() {
        Square.square(-1);
    }

    @Test
    public void testRectangle_double() {
        Assert.assertEquals(2.5 * 5.5, Rectangle.square(2.5, 5.5), 0.0001);
    }

    @Test
    public void testRectangle_int() {
        Assert.assertEquals(2 * 3, Rectangle.square(2, 3), 0.0001);
    }

    @Test
    public void testRectangle_zero() {
        Assert.assertEquals(0, Rectangle.square(0, 10), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testRectangle_throw() {
        Rectangle.square(-1, 10);
    }

    @Test
    public void testCircle_double() {
        Assert.assertEquals(2.5 * 2.5 * Math.PI, Circle.square(2.5), 0.0001);
    }

    @Test
    public void testCircle_int() {
        Assert.assertEquals(2 * 2 * Math.PI, Circle.square(2), 0.0001);
    }

    @Test
    public void testCircle_zero() {
        Assert.assertEquals(0, Circle.square(0), 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testCircle_throw() {
        Circle.square(-1);
    }

}
