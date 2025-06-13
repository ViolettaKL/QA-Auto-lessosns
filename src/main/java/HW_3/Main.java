package HW_3;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Company employee1 = new Company(1, "Sara");
        Company employee2 = new Company(2, "Anna");
        Company employee3 = new Company(3, "Kate");
        Company.companyName = "Netflix";
        Company.printCompanyName();

        //Задание 2
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(1.5));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(1.7));

        //Задание 3 в классе LibraryTest

        //Задание 4
        University student1 = new University(1, "Олег");
        University student2 = new University(2, "Мария");
        University student3 = new University(3, "Анна");
        University.changeUniversityName("Технический университет");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        //Задание 5
        GameSettings gameSettings1 = new GameSettings("GTA", 23);
        GameSettings gameSettings2 = new GameSettings("Dota", 53);
        GameSettings.setMaxPlayers(100);
        gameSettings1.addPlayer();
        gameSettings2.addPlayer();
        gameSettings1.printGameStatus();
        gameSettings2.printGameStatus();

        //Задание 6
        Person person1 = new Person("Иван", "Павлов", "346-43-4574");
        Person person2 = new Person("Анна", "Семенова", "653-76-1465");
        Person person3 = new Person("Павел", "Петров", "143-65-2476");
        person1.setFirstName("Виктор");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();

    }
}
