package HW_5.FarmManage;

public class Chicken extends FarmAnimal{
    @Override
    void produce() {
        System.out.println("Курица несет яйца");
    }

    @Override
    void care() {
        System.out.println("Курицу нужно накормить зерном");
    }

    @Override
    void feed() {
        System.out.println("Курица ест зерно");
    }
}
