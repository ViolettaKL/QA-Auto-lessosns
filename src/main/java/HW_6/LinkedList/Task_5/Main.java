package HW_6.LinkedList.Task_5;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Первый");
        strings.add("Второй");
        strings.add("Третий");

        ListIterator<String> iterator = strings.listIterator();
        System.out.println("Проход вперед: ");
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
        System.out.println("\nПроход назад: ");
        while (iterator.hasPrevious()){
            String string = iterator.previous();
            System.out.println(string);
        }
    }
}
