package HW_2;

public class Point {
    int x;
    int y;

    Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    void print(){
        System.out.println("Координаты: " + "x:" + this.x + " y:" + this.y);
    }
}
