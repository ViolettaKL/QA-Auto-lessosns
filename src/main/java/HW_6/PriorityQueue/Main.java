package HW_6.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(23);
        numbers.add(54);
        numbers.add(7);
        numbers.add(76);
        numbers.add(15);

        System.out.println("Числа в порядке удаления: ");
        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
