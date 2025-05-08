package HW_8.funcionalLambda.Task_1;

public class Main {
    public static void main(String[] args) {

        MathOperations sum = (a, b) -> a + b;
        MathOperations subtract = (a, b) -> a - b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations divide = (a, b) -> a / b;

        System.out.println("Сложение: " + sum.operate(6.5, 8));
        System.out.println("Вычитание: " + subtract.operate(23.3, 5));
        System.out.println("Умножение: " + multiply.operate(2, 3));
        System.out.println("Деление: " + divide.operate(45, 5));
    }
}
