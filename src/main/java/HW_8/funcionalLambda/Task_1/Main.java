package HW_8.funcionalLambda.Task_1;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = ((a, b) -> a + b);
        MathOperation substract = ((a, b) -> a - b);
        MathOperation multiply = ((a, b) -> a * b);
        MathOperation divide = ((a, b) -> a / b);

        System.out.println("Сложение: " + sum.operate(6.5, 8.9));
        System.out.println("Вычитание: " + substract.operate(13.5, 6));
        System.out.println("Умножение: " + multiply.operate(8, 5.5));
        System.out.println("Деление: " + divide.operate(45.5, 7.5));
    }
}
