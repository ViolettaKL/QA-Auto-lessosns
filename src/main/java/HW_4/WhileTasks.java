package HW_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        //Вычисление факториала с помощью while
        factorial();

        //Вывод всех чётных чисел до заданного
        evenNumbers();

        //Обратный отсчёт от введённого числа до 1
        countDown();

    }

    //Вычисление факториала с помощью while
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validNumber = false;
        while (!validNumber){
            System.out.println("Введите положительное число");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                if (number < 0){
                    System.out.println("Число не должно быть отрицательным");
                }else {
                    validNumber = true;
                }
            }else {
                System.out.println("Введите целое число");
                scanner.next();
            }
        }
            int result = 1;
            int i =1;
            while(i <= number){
                result *= i;
                i++;
            }
        System.out.println("Факториал равен: " + result);
    }

    //Вывод всех чётных чисел до заданного
    public static void evenNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validNumber = false;
        while (!validNumber){
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                if(number < 0){
                    System.out.println("Число не должно быть отрицательным");
                }else {
                    validNumber = true;
                }
            }else {
                System.out.println("Введите целое число: ");
                scanner.next();
            }
        }
        int i = 0;
        while(i <= number){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Обратный отсчёт от введённого числа до 1
    public static  void countDown(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validNumber = false;
        while (!validNumber){
            System.out.println("Введите положительное число: ");
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                if(number < 0){
                    System.out.println("Число не должно быть отрицательным");
                }else {
                    validNumber = true;
                }
            }else {
                System.out.println("Введите целое число: ");
                scanner.next();
            }
        }
        while (number >= 1){
            System.out.println(number);
            number --;
        }
    }
}
