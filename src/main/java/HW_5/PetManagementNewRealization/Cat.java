package HW_5.PetManagementNewRealization;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет");
    }
}
