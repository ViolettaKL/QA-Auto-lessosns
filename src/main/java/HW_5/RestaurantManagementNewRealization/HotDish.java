package HW_5.RestaurantManagementNewRealization;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    void showCharacteristics() {
        System.out.println("Температура горячего блюда " + this.temperature);
    }
}
