package HW_7.Generics.Task_1;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println(integerBox.get());

        Box<String> stringBox = new Box();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
    }
}
