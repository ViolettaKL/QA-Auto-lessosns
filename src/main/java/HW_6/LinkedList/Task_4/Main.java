package HW_6.LinkedList.Task_4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(34);
        numbers.add(10);
        numbers.add(6);
        numbers.add(56);
        numbers.add(10);

        int sum = 0;
        for (int number : numbers){
            sum +=number;
        }
        System.out.println("Сумма элементов списка: " + sum);
    }
}
