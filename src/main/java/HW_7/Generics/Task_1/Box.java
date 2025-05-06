package HW_7.Generics.Task_1;

public class Box <T> {
    private T item;

    public void set(T item){
        this.item = item;
    }
    public T get(){
        return item;
    }
}
