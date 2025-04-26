package HW_5.PetManagement;

public class PetManagement {
    private Pet pet;

    public void setPet(Cat pet) {
        this.pet = pet;
    }

    public void applyPet(){
        pet.feed();
        pet.interact();
    }
}
