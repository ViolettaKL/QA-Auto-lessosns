package HW_2;

public class Product {
    public String name;
    public double price;

    Product(String name, double price){
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
    public void applyDiscount(double discount){
        price = price - price * (discount / 100);
    }
    public void printInfo(){
        System.out.println("Товар: " + this.name + " Цена: " + this.price);
    }
}
