public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 6;
        char operation = '^';
        int result;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '^') {
            result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else {
            result = firstNumber % secondNumber;
        }
        System.out.printf("%d %c %d = %d%n", firstNumber, operation, secondNumber, result);
    }
}