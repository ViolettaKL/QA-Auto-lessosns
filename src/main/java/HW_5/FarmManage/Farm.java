package HW_5.FarmManage;

public class Farm {
    private  FarmAnimal animal;

    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    void animalManage(){
        animal.care();
        animal.produce();
        animal.feed();
    }
}
