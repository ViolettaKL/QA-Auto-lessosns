package HW_FirstProgram;

public class MathOperations {

    public static void main(String[] args) {
        int add1 = add(34, 6);
        System.out.println("Сумму двух чисел равно " + add1);

        int subtract1 = subtract(23, 5);
        System.out.println("Разность двух чисел равно " + subtract1);

        int multiply1 = multiply(45, 9);
        System.out.println("Произведение двух чисел равно " + multiply1);

        double divide1 = divide(12.4, 2.3);
        System.out.println("Результат деления двух чисел равно " + divide1);

        int findMax1 = findMax(4, 6);
        System.out.println("Большее из двух чисел " + findMax1);

        int difference1 = difference(56, 23);
        System.out.println("Результат разницы между двумя числами " + difference1);

        int squareArea1 = squareArea(4);
        System.out.println("Площадь квадрата равна " + squareArea1);

        int squarePerimeter1 = squarePerimeter(6);
        System.out.println("Периметр квадрата равен " + squarePerimeter1);

        double convertSecondsToMinutes1 = convertSecondsToMinutes(120);
        System.out.println("Перевод минут в секундах равно " + convertSecondsToMinutes1);

        double averageSpeed1 = averageSpeed(4, 30);
        System.out.println("Среднее скорость равна " + averageSpeed1);

        double findHypotenuse1 = findHypotenuse(2, 4);
        System.out.println("Результат нахождения гипотенузы " + findHypotenuse1);

        double circleCircumference1 = circleCircumference(2);
        System.out.println("Длина окружности равно " + circleCircumference1);

        double calculatePercentage1 = calculatePercentage(5, 2);
        System.out.println("Процент от общего " + calculatePercentage1);

        double celsiusToFahrenheit1 = celsiusToFahrenheit(3);
        System.out.println("Температура по Фаренгейту равна " + celsiusToFahrenheit1);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(30);
        System.out.println("Температура по Цельсию " + fahrenheitToCelsius1);

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    //метод для нахождения максимума двух чисел
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    //метод нахождения разницы между двумя числами
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    //метод для вычисления площади квадрата
    public static int squareArea(int side) {
        return side * side;
    }

    //метод для вычисления периметра у квадрата
    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    // метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60.0;
    }

    //метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    //метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    //метод для длины окружности
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //Метод для вычисления процентов
    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return (part / total) * 100;
    }

    // метод для вычисления температуры по Фаренгейту
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    // метод для вычисления температуры по Цельсию
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
}
