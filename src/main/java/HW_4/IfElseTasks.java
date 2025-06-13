package HW_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        //Определение знака числа
        definitionOfNumber();

        //Определение наибольшего из двух чисел
        numberMax();

        // Вывод оценки по шкале от 1-5
        schoolGrade();

        //Проверка на четность
        checkForEvenNumber();

        //Определение размера скидки по возрасту
        ageDiscount();

        //Оценка результата теста по баллам
        cheсkingTestResult();
    }

    //Определение знака числа
    public static void definitionOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("Число положительное");
        }else if (number < 0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число равно нулю");
        }
    }

    //Определение наибольшего из двух чисел
    public static void numberMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        int maxNumber = number1;
        if (number1 > number2){
            maxNumber = number1;
        } else if (number1 < number2) {
            maxNumber = number2;
        }
        System.out.println("Максимальное число: " + maxNumber);
    }

    // Вывод оценки по шкале от 1-5
    public static void schoolGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку от 1  до 5: ");
        int schoolGrade = scanner.nextInt();
        switch (schoolGrade){
            case 1:
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Неверный ввод. Введите оценку от 1 до 5");
                break;
        }
    }

    //Проверка на четность
    public static void checkForEvenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Число четное");
        }else {
            System.out.println("Нечетное");
        }
    }

    //Определение размера скидки по возрасту
    public static void ageDiscount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        if(age <= 18){
            System.out.println("Ваша скидка 25%");
        } else if (age >= 65) {
            System.out.println("Ваша скидка 30%");
        }else {
            System.out.println("Вы без скидки");
        }
    }

    //Оценка результата теста по баллам
    public static  void cheсkingTestResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество баллов от 1 до 100: ");
        int testResult = scanner.nextInt();
        if(testResult >= 90){
            System.out.println("Отлично");
        }else if (testResult >= 75){
            System.out.println("Хорошо");
        }else if (testResult >= 60){
            System.out.println("Удовлетворительно");
        }else {
            System.out.println("Неудовлетворительно");
        }
    }
}
