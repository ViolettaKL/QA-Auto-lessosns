package HW_5.PetManagment;

public class PetManagment {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void applyPet(){
        pet.feed();
        pet.interact();
    }
}
