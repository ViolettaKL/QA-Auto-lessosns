package HW_5.PetManagment;

public class Main {
    public static void main(String[] args) {
        PetManagment petManagment = new PetManagment();
        Cat cat = new Cat();
        petManagment.setPet(cat);
        petManagment.applyPet();
    }
}
