package HW_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        //Запрос положительного числа
        PositiveNumber();

        //Проверка пароля
        CheckPassword();

        //Вывод чисел от 1 до 10 с использованием do-while
        Numbers();

        //Завершение программы по команде "exit"
        ExitCommand();

        //Подсчёт количества цифр в числе
        CountDigitsNumber();
    }

    //Запрос положительного числа
    public static void PositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Вы ввели положительное число: " + number);
    }

    //Проверка пароля
    public static void CheckPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        String userInput;
        do {
            System.out.println("Введите пароль: ");
            userInput = scanner.nextLine();
            if(!userInput.equals("1234")){
                System.out.println("Ошибка. Неверный пароль.");
            }
        } while (!userInput.equals(password));
        System.out.println("Пароль верный");
    }

    //Вывод чисел от 1 до 10 с использованием do-while
    public static void Numbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //Завершение программы по команде "exit"
    public static void ExitCommand() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
            if (!command.equals("exit")){
                System.out.println("Ошибка. Неверная команда. Введите 'exit' для завершения программы");
            }
        } while (!command.equals("exit"));
        System.out.println("Программа завершена");
        scanner.close();
    }

    //Подсчёт количества цифр в числе
    public static void CountDigitsNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number != 0) {
                count++;
                number /= 10;
            }
            }while (number != 0) ;
            System.out.println("Количество цифр: " + count);
        }
    }

