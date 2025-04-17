package HW_4;

import java.util.Scanner;

public class IfElseHomeTasks {
    public static void main(String[] args) {
        //Определение знака числа
        definitionOfNumber();

        //Поиск наибольшего из двух чисел
        numberMax();

        //Проверка на чётность
        checkForEvenNumber();

        //Определение размера скидки по возрасту
        ageDiscount();

        // Оценка результата теста по баллам
        checkingTestResult();

        //Перевод числовых оценок в буквенные (A–F)
        letterGrades();
    }

    //Определение знака числа
    public static void definitionOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число:");
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void numberMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введи второе число: ");
        int number2 = scanner.nextInt();

        int maxNumber = number1;
        if (number1 > number2){
            maxNumber = number1;
        } else if (number1 < number2) {
            maxNumber = number2;

        } System.out.println("Максимальное число: " + maxNumber);
    }

    public static void checkForEvenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }
    }

    public static void ageDiscount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();
        if (age <= 18){
            System.out.println("Скидка 25%");
        } else if (age >= 65) {
            System.out.println("Скидка 30%");
        }else{
            System.out.println("Без скидки");
        }
    }

    public static void checkingTestResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов от 1 до 100: ");
        int testResult = scanner.nextInt();
        if (testResult >= 90){
            System.out.println("Отлично");
        } else if (testResult >=75) {
            System.out.println("Хорошо");
        } else if (testResult >= 60) {
            System.out.println("Удовлетворительно");
        } else{
            System.out.println("Неудовлетворительно");
        }
    }

    public static void letterGrades(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов от 1 до 100: ");
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <= 100){
            System.out.println("Ваша оценка A");
        } else if (grade >= 80 && grade <= 89 ) {
            System.out.println("Ваша оценка B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Ваша оценка C");
        }else if (grade >= 60 && grade <= 69){
            System.out.println("Ваша оценка D");
        }else {
            System.out.println("Ваша оценка F");
        }
    }
}
