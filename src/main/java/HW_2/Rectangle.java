package HW_2;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int calculateArea(){
        return width * height;
    }
    void print(){
        System.out.println("Ширина: " + this.width + " Высота: " + this.height);
    }
}
