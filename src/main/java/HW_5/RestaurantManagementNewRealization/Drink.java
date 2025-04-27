package HW_5.RestaurantManagementNewRealization;

public class Drink extends Dish{
   private int volume;

    @Override
    void showCharacteristics() {
        System.out.println("Объем напитка" + this.volume);
    }

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
