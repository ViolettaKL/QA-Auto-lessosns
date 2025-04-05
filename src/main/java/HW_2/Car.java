package HW_2;

public class Car {

    String brand;
    int year;

    Car(int someYear, String someBrand) {
        this.brand = someBrand;
        this.year = someYear;
    }
    String getBrand(){
        return  this.brand;
    }
    int getYear() {
        return this.year;
    }
    void setYear(int newYear){
        this.year = newYear;
    }
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    void print() {
        System.out.println("Год выпуска " + this.year + ", Марка автомобиля " + this.brand);
    }
}
