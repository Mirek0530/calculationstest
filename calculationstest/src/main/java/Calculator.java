public class Calculator {

    private double result;

    public double getResult() {
        return result;
    }

    public double addition(double x, double y) {
        result = x + y;
        return result;
    }

    public double subtraction(double x, double y) {
        result = x - y;
        return result;
    }

    public double multiplication(double x, double y) {
        result = x * y;
        return result;
    }

    public double division(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Dividing by zero!");
        } else {
            result = x / y;
            return result;
        }
    }
}
