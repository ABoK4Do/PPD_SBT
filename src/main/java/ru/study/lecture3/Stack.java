package ru.study.lecture3;

public class Stack {
    boolean empty = true;
    String element;

    public boolean isEmpty() {
        return empty;
    }

    public void push(String s) {
        this.element = s;
        empty = false;
    }
}
