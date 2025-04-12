package HW_2;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Car toyota = new Car(2005, "Тойота Королла");
        toyota.print();
        toyota.year = 2010;
        toyota.print();


        Car lada = new Car(2020, "Лада Гранта");
        lada.print();
        lada.brand = "Лада Веста";
        lada.print();

        //Задание 2
        Rectangle areaRectangle = new Rectangle(6,3);
        areaRectangle.print();
        areaRectangle.width = 8;
        areaRectangle.print();

       //Задание 3
        Book bookParameters = new Book("Гарри Поттер", "Джоан Роулинг");
        bookParameters.printInfo();
        bookParameters.autor = "Гермиона";
        bookParameters.printInfo();

        //Задание 4
        BankAccount bankAccount = new BankAccount("Петя Иванов", 800.00);
        BankAccount.deposit(1300);
        BankAccount.withdraw(200);
        BankAccount.printBalance();

        //Задание 5
        Point pointParameters = new Point(5, 10);
        pointParameters.print();
        pointParameters.setX(7);
        pointParameters.print();

        //Задание 6
        StudentGroup studentGroupInfo = new StudentGroup("QA", 25);
        studentGroupInfo.printInfo();

        //Задание 7
        Circle circle = new Circle(12.3);
        circle.setRadius(13.0);
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Окружность: " + circle.calculateCircumference());

        //Задание 8
        Teacher teacher = new Teacher("Борисова Анастасия", "Математика");
        teacher.printInfo();
        teacher.setSubject("Литература");
        teacher.printInfo();

        //Задание 9
        Product product = new Product("Хлеб", 50.0);
        product.printInfo();
        product.setPrice(54.99);
        product.printInfo();

        //Задание 10
        Laptop laptop = new Laptop("Lenovo", 74000.00);
        laptop.printInfo();
        laptop.setPrice(83000.00);
        laptop.printInfo();
    }
}
