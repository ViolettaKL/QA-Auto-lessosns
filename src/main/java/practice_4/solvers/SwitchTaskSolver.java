package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        //проверка метода возвращающего день недели по числу
        System.out.println(dayOffWeek(2));
        System.out.println(dayOffWeek(15));

        //проверка метода по описанию сезона
        System.out.println(describeSeason(Season.WINTER));
    }
    public static String dayOffWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
            default:
                dayOfWeek = "Несуществующий день недели";

        }
        return dayOfWeek;
    }
    public static String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима";
            case SUMMER -> description = "Лето";
            case SPRING -> description = "Весна";
            case AUTUMN -> description = "Осень";

        }
        return description;
    }
}
