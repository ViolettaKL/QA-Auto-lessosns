package HW_6.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
         deque.add("Элемент 1");
         deque.add("Элемент 2");
         deque.add("Элемент 3");
         deque.add("Элемент 4");
         deque.add("Элемент 5");

        System.out.println("Элементы в ArrayDeque");
        for(String element : deque){
            System.out.println(element);
        }
    }
}
