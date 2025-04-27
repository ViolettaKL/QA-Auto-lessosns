package HW_5.RestaurantManagement;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dish dish = new Drink(250);
        menu.setDish(dish);
        menu.printDish();
    }
}
