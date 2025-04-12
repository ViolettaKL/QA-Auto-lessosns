package HW_2;

public class Circle {
    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
