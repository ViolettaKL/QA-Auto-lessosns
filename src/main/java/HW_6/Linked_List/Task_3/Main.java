package HW_6.Linked_List.Task_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Select");
        strings.add("Option");
        strings.add("Like");

        if (!strings.isEmpty()){
            System.out.println("Первый элемент: " + strings.getFirst());
            System.out.println("Последний элемент: " + strings.getLast());
        }

    }
}
