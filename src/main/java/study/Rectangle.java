package study;

public class Rectangle {
    public static double square(double a, double b) {
        if (a < 0 || b < 0) {
            throw new NumberFormatException();
        }
        return a * b;
    }
}
