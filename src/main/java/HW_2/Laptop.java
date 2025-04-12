package HW_2;

public class Laptop {
    private String brand;
    private double price;

    Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("Наименование: " + this.brand + " Цена: " + this.price);
    }
}
