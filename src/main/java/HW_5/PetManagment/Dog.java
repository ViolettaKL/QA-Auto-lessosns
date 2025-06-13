package HW_5.PetManagment;

public class Dog extends Pet{
    @Override
    void feed(){
        System.out.println("Собака ест сухой корм");
    }
    @Override
    void interact(){
        System.out.println("Собака гуляет");
    }
}
