package study;

public class Square {
    public static double square(double a) {
        if (a < 0) {
            throw new NumberFormatException();
        }
        return a * a;
    }
}
