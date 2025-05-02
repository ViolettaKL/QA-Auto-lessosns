package practice_6.Collections.task_2.RestaurantManager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка Фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргарита");
        manager.printOrders();

        manager.deleteOrder("Спагетти");
        manager.printOrders();
    }
}
