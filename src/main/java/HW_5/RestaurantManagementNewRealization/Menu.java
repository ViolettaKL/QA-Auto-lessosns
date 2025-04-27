package HW_5.RestaurantManagementNewRealization;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish){
        this.dish = dish;
    }

    public void showCharacteristics(){
        this.dish.showCharacteristics();
    }
}
