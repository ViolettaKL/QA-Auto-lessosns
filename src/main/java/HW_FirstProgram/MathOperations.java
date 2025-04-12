package HW_FirstProgram;

public class MathOperations {

    public static void main(String[] args){
        int add1 = add(3,34);
        System.out.println("Сумма двух чисел равна " + add1);

        int subtract1 = subtract(23,6);
        System.out.println("Разность двух чисел равна " + subtract1);

        int multiply1 = multiply(4,3);
        System.out.println("Произведение двух чисел равно " + multiply1);

        double divide1 = divide(17,3);
        System.out.println("Результат деления двух чисел равен " + divide1);

        int findMax1 = findMax(5, 8);
        System.out.println("Большее из двух чисел " + findMax1);

        int difference1 = difference(67, 8);
        System.out.println("Результат разницы между двумя числами " + difference1);

        int squareArea1 = squareArea(4);
        System.out.println("Площадь квадрата равна " + squareArea1);

        int squarePerimeter1 = squarePerimeter(6);
        System.out.println("Периметр квадрата равен " + squarePerimeter1);

        double convertSecondsToMinutes1 = convertSecondsToMinutes(34);
        System.out.println("Перевод минут в секундах равно " + convertSecondsToMinutes1);

        double averageSpeed1 = averageSpeed(4,30);
        System.out.println("Средняя скорость равна " + averageSpeed1);
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y) {
        return (double) x / y;
    }
    //метод для нахождения максимума двух чисел
    public static int findMax(int a, int b){
        return Math.max(a, b);
    }
    //Метод для нахождения разницы между двумя числами
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    //Метод для вычисления площади квадрата
    public static int squareArea(int side){
        return side * side;
    }
    //Метод для вычисления периметра квадрата
    public static int squarePerimeter(int side){
        return 4 * side;
    }
    //Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60.0;
    }
    //Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }
    //Метод для нахождения гипотенузы
    public static  double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
    //Метод для длины окружности
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    //Метод для вычисления процентов
    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }
}
