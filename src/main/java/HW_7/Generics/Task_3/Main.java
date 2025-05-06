package HW_7.Generics.Task_3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>();
        pair.setFirst(10);
        pair.setSecond("Какой то текст");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }
}
