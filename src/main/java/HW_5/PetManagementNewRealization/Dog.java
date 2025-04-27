package HW_5.PetManagementNewRealization;

public class Dog extends Pet implements Walkable{

    @Override
    void eat() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
