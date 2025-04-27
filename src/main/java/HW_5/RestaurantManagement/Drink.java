package HW_5.RestaurantManagement;

public class Drink implements Dish{
    private int volume;

    public Drink(int volume){
        this.volume = volume;
    }
    @Override
    public String getDescription() {
        return "Объем напитка " + volume + "мл";
    }
}
