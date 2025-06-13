package HW_5.FarmManage;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        FarmAnimal animal = new Chicken();
        farm.setAnimal(animal);
        farm.animalManage();

        FarmAnimal animal1 = new Cow();
        farm.setAnimal(animal1);
        farm.animalManage();
    }
}
