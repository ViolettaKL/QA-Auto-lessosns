package HW_2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discount){
        return price = price - price * (discount / 100);
    }

    public void printInfo(){
        System.out.println("Товар: " + this.name + " Цена: " + this.price);
    }
}
