package ru.study.lecture3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestStack {



    @Test
    public void testNewStackIsEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmptyAfterPush(){
        Stack stack = new Stack();
        stack.push("123");
        assertFalse(stack.isEmpty());
    }
}
