package HW_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        //Сумма чисел до первого отрицательного (использовать break)
        sumNumbers();

        //Пропуск чисел, делящихся на 3 (использовать continue)
        skippingNumbersDivisibleByThree();

        //Вывод только положительных чисел (использовать continue)
        positiveNumbers();

        //Ввод строк до команды "stop" (использовать break)
        InputStop();
    }

    //Сумма чисел до первого отрицательного (использовать break)
    public static void sumNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.println("Введите число: ");
            try {
                int number = scanner.nextInt();
                if (number < 0) {
                    break;
                }
                sum += number;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введите целое число.");
                scanner.next();
            }
        }
        System.out.println("Сумма введенных чисел: " + sum);
        scanner.close();
    }

    //Пропуск чисел, делящихся на 3 (использовать continue)
    public static void skippingNumbersDivisibleByThree(){
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    //Вывод только положительных чисел (использовать continue)
    public static void positiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число (или exit для выхода из программы): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number < 0) {
                    continue;
                }
                System.out.println("Положительное число: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введите целое число");
            }scanner.close();
        }
    }

    //Ввод строк до команды "stop" (использовать break)
    public static void InputStop(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку или stop для выхода из программы: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            System.out.println("Вы ввели: " + input);
        }
        System.out.println("Программа завершена");
    }
}
