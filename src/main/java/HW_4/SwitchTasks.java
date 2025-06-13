package HW_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        //Вывод дня недели по номеру
        daysOfWeek();

        //Стоимость билета по дню недели
        buyTicket();

        //Перевод числовых оценок в буквенные (A–F)
        letterGrades();

        //Обработка текстовых команд
        systemStatus();

        //Простой калькулятор с использованием switch
         calculator();

    }

    //Вывод дня недели по номеру
    public static void daysOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Несуществующий день недели");
                break;
        }scanner.close();
    }

    //Стоимость билета по дню недели
    public static  void buyTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билета 300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета 450 рублей");
                break;
            default:
                System.out.println("Несуществующий день недели");
                break;

        }scanner.close();
    }

    //Перевод числовых оценок в буквенные (A–F)
    public static void letterGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        int grade = scanner.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Оценка должна быть в диапазоне от 0 до 100");
        } else {
            char letter;
            switch (grade / 10) {
                case 10:
                case 9:
                    letter = 'A';
                    break;
                case 8:
                    letter = 'B';
                    break;
                case 7:
                    letter = 'C';
                    break;
                case 6:
                    letter = 'D';
                    break;
                default:
                    letter = 'F';
                    break;
            }
            System.out.println("Ваша оценка: " + letter);
        }scanner.close();
    }

    //Обработка текстовых команд
    public static void systemStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String command = scanner.nextLine();
        switch (command){
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система приостановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Система работает");
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }
        scanner.close();
    }

    //Простой калькулятор с использованием switch
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите оператор (+,-,*,/)");
        String operator = scanner.next();
        switch (operator){
            case "+":
                System.out.println("Результат: " + (a + b));
                break;
            case "-":
                System.out.println("Результат: " + (a - b));
                break;
            case "*":
                System.out.println("Результат: " + (a * b));
                break;
            case "/":
                if(b == 0){
                    System.out.println("Деление на 0 невозможно");
                }else{
                    System.out.println("Результат: " + (a / b));
                }break;
            default:
                System.out.println("Неизвестный оператор");
                break;
        }scanner.close();
    }
}
