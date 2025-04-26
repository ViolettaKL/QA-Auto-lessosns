package HW_5.PetManagement;


public class Main {
    public static void main(String[] args) {
        PetManagement petManagement = new PetManagement();
        Cat cat = new Cat();
        petManagement.setPet(cat);
        petManagement.applyPet();
    }
}
