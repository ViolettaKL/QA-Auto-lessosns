package HW_5.PetManagement;


public class Cat extends Pet {
    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    void interact() {
        System.out.println("Кошка играет");
    }
}
