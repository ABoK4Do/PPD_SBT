package ru.study.task2;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
    @Test
    public void testSquare_double() {
        Assert.assertEquals(2.5 * 2.5, new Square(2.5).getArea(), 0.0001);
    }

    @Test
    public void testSquare_int() {
        Assert.assertEquals(2 * 2, new Square(2).getArea(), 0.0001);
    }

    @Test
    public void testSquare_zero() {
        Assert.assertEquals(0, new Square(0).getArea(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquare_throw() {
        new Square(-1).getArea();
    }

    @Test
    public void testRectangle_double() {
        Assert.assertEquals(2.5 * 5.5, new Rectangle(2.5, 5.5).getArea(), 0.0001);
    }

    @Test
    public void testRectangle_int() {
        Assert.assertEquals(2 * 3, new Rectangle(2, 3).getArea(), 0.0001);
    }

    @Test
    public void testRectangle_zero() {
        Assert.assertEquals(0, new Rectangle(0, 10).getArea(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRectangle_throw() {
        new Rectangle(-1, 10).getArea();
    }

    @Test
    public void testCircle_double() {
        Assert.assertEquals(2.5 * 2.5 * Math.PI, new Circle(2.5).getArea(), 0.0001);
    }

    @Test
    public void testCircle_int() {
        Assert.assertEquals(2 * 2 * Math.PI, new Circle(2).getArea(), 0.0001);
    }

    @Test
    public void testCircle_zero() {
        Assert.assertEquals(0, new Circle(0).getArea(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircle_throw() {
        new Circle(-1).getArea();
    }

}
