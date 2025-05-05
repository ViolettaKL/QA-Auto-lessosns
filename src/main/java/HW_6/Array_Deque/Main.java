package HW_6.Array_Deque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> number = new ArrayDeque<>();
        number.addLast(1);
        number.addLast(2);
        number.addLast(3);
        number.addLast(4);
        number.addLast(5);

        System.out.println("Вывод элементов в порядке очереди: ");
        while (!number.isEmpty()){
            System.out.println(number.removeFirst());
        }
    }
}
