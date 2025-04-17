package HW_4;

import java.util.Scanner;

public class SwitchHomeTask {
    public static void main(String[] args) {
        // Метод вывода оценки по шкале 1–5
        schoolGrade();

        //Вывод дня недели по номеру
        daysOfWeek();

        //Стоимость билета по дню недели
        buyTicket();
    }

    //Вывод оценки по шкале 1–5
    public static void schoolGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи оценку от 1 до 5: ");
        int schoolGrade = scanner.nextInt();
        switch (schoolGrade) {
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
                System.out.println("Неверный ввод. Введите число от 1 до 5.");
                break;
        }
    }

    public static void daysOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число от 1 до 7: ");
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
        }
    }

    public static void buyTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число от 1 до 7: ");
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
        }
    }
}

