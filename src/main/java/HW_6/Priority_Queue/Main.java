package HW_6.Priority_Queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.offer(13);
        number.offer(24);
        number.offer(56);
        number.offer(10);
        number.offer(67);

        System.out.println("Элементы в порядке очереди: ");
        while (!number.isEmpty()){
            System.out.println(number.poll());
        }
    }
}
