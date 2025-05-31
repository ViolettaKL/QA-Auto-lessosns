package HW_2;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Car toyota = new Car("Тойота Королла", 2005);
        toyota.setYear(2006);
        toyota.print();

        //Задание 2
        Rectangle areaRectangle = new Rectangle(6, 3);
        areaRectangle.setWidth(8);
        areaRectangle.print();

        //Задание 3
        Book bookParameters = new Book("Гарри Поттер", "Джоан Роулинг");
        bookParameters.setAuthor("Пушкин");
        bookParameters.printInfo();

        //Задание 4
        BankAccount bankAccount = new BankAccount("Петя Иванов", 800.12);
        bankAccount.deposit(100.32);
        bankAccount.withdraw(300.45);
        bankAccount.printBalance();

        //Задание 5
        Point pointParameters = new Point(5, 10);
        pointParameters.setX(7);
        pointParameters.print();

        //Задание 6
        StudentGroup studentGroupInfo = new StudentGroup("Группа 1", 25);
        studentGroupInfo.setStudentCount(26);
        studentGroupInfo.printInfo();

        //Задание 7
        Circle circle = new Circle(12.3);
        circle.setRadius(13.4);
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Окружность: " + circle.calculateCircumference());

        //Задание 8
        Teacher teacher = new Teacher("Иванова Мария", "Математика");
        teacher.setSubject("Литература");
        teacher.printInfo();

        //Задание 9
        Product product = new Product("Хлеб", 50.99);
        product.setPrice(64.90);
        product.applyDiscount(5);
        product.printInfo();

        //Задание 10
        Laptop laptop = new Laptop("Lenovo", 74000.90);
        laptop.setPrice(87000.90);
        laptop.printInfo();
    }
}
