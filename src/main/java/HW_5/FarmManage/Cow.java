package HW_5.FarmManage;

public class Cow extends FarmAnimal{
    @Override
    void produce() {
        System.out.println("Корова дает молоко");
    }

    @Override
    void care() {
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    void feed() {
        System.out.println("Корова жует траву");
    }
}
