package HW_5.RestaurantManagement;

public class HotDish  implements Dish{
    private int temperature;

    public HotDish(int temperature){
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return "Температура блюда " + temperature + " C";
    }
}
