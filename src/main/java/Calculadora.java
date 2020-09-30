public class Calculadora {

    private DoubleMath doubleMath;


    public double addittion (double firstNumber, double secondNumber) {
        doubleMath = (p1, p2) -> p1 + p2;
        return doubleMath.operation(firstNumber, secondNumber);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        doubleMath = (p1, p2) -> p1 - p2;
        return doubleMath.operation(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        doubleMath = (p1, p2) -> p1 * p2;
        return doubleMath.operation(firstNumber, secondNumber);
    }

    public double divition(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("divition by zero");
        }
        doubleMath = (p1, p2) -> p1 / p2;
        return doubleMath.operation(firstNumber, secondNumber);
    }

}
