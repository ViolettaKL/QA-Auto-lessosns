package HW_5.Zoo;

public class Bird extends Animal{
    @Override
    void makeSound(){
        System.out.println("Чирикает");
    }

    @Override
    void makeMove(){
        System.out.println("Летает");
    }
}
