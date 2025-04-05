package HW_2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWight, int someHeight) {
        this.width = someWight;
        this.height = someHeight;
    }
    int getWight(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }
    int setWight(){
        return this.width;
    }
    int calculateArea(){
        return width * height;
    }
    void print(){
        System.out.println("Ширина " + this.width + " Высота " + this.height);
    }
}

