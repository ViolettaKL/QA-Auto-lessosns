package HW_5.RestaurantManagement;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish){
        this.dish = dish;
    }

    public void printDish(){
        System.out.println(dish.getDescription());
    }
}
