package HW_3;

import static HW_3.Company.printCompanyName;
import static HW_3.MathConstants.calculateCircleArea;

public class Main {
    public static void main(String[] args) {

        ///Задание 1
        Company employee1 = new Company(1, "Sara");
        Company employee2 = new Company(2, "Kevin");
        printCompanyName();

        Company.companyName = "New Netflix";
        printCompanyName();

        employee1.setEmployeeName("Anny");
        System.out.println("Employee ID: " + employee1.employeeID + ", Name: " + employee1.getEmployeeName());
//
//        /// Задание 2
        System.out.println("Площадь круга: " + calculateCircleArea(2));
        System.out.println("Длина окружности: " + calculateCircleArea(4));
//
//       /// Задание 3
        // Доступ к публичному полю category
        Library.category = "Ужасы";
        System.out.println("Категория: " + Library.getCategory());

        // Доступ к полю year с default-доступом
        Library.year = 2025;
        System.out.println("Год выпуска: " + Library.getYear());

        // Попытка доступа к полю author
        Library.setAuthor("Стивен Кинг");
        System.out.println("Автор: " + Library.getAuthor());

        // Попытка доступа к приватному полю bookTitle
        Library.setBookTitle("Кладбище домашних животных");
        System.out.println("Наименование: " + Library.getBookTitle());

        ///Задание 4
        University university1 = new University(1, "Олег");
        University university2 = new University(2, "Мария");
        University university3 = new University(3, "Анна");
        University.changeUniversityName("Прикладная информатика");
        university1.printStudentInfo();
        university2.printStudentInfo();
        university3.printStudentInfo();

        /// Задание 5
        GameSettings gameSettings1 = new GameSettings("GTA");
        GameSettings gameSettings2 = new GameSettings("NFC");
        GameSettings.setMaxPlayers(34);
        gameSettings1.addPlayer();
        gameSettings2.addPlayer();
        gameSettings1.printGameStatus();
        gameSettings2.printGameStatus();

        /// Задание 6
        Person person1 = new Person("Матвей", "Иванов", "123-45-6789");
        Person person2 = new Person("Иван", "Иванов", "123-45-8647");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person1.setLastName("Петров");
        person1.printPersonInfo();
    }
}
