public class Calculator {

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double substract(double a, double b) {
        double result = a - b;
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    public static double percentage(double a, double b) {
        double result = (a * (b / 100.0));
        return result;
    }
}
