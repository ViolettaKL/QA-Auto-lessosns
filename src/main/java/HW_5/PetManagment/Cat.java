package HW_5.PetManagment;

public class Cat extends Pet{
    @Override
    void feed(){
        System.out.println("Кошка ест влажный корм");
    }
    @Override
    void interact(){
        System.out.println("Кошка играет");
    }
}
