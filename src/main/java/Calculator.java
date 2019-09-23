public class Calculator {

    private double answer;

    public double getAnswer() {
        return this.answer;
    }

    public void addNumbers(double firstNumber, double secondNumber) {
        this.answer = firstNumber + secondNumber;
    }

    public void subtractNumbers(double firstNumber, double secondNumber) {
        this.answer = firstNumber - secondNumber;
    }

    public void multiplyNumbers(double firstNumber, double secondNumber) {
        this.answer = firstNumber * secondNumber;
    }

    public void divideNumbers(double firstNumber, double secondNumber) {
        this.answer = firstNumber/secondNumber;
    }
}
