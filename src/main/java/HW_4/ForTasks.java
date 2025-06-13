package HW_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        //Вывод чисел от 1 до 100, делящихся на 3
        numbersDivisibleByThree();

        //Сумма чисел от 1 до n
        sumOfNumbers();

        //Таблица умножения для числа
        multiplicationTable();

        //Проверка на простое число
        primeNumber();

        //Вывод чисел от 1 до 10
        numbers();
    }

    //Вывод чисел от 1 до 100, делящихся на 3
    public static void numbersDivisibleByThree(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    //Сумма чисел от 1 до n
    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
        scanner.close();
    }

    //Таблица умножения для числа
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }scanner.close();
    }

    //Проверка на простое число
    public static void primeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        //проверка на числа <= 1
        if(number <= 1){
            System.out.println(number + " не является простым числом");
            scanner.close();
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " является простым числом");
        }else {
            System.out.println(number + " не является простым числом");
        }scanner.close();
    }

    // Вывод чисел от 1 до 10
    public static void numbers(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
