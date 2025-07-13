package HW_6.LinkedHashSet.Task_1;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);

        System.out.println("Все элементы: " + numbers);
    }
}
