package HW_6.LinkedList.Task_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        while(!tasks.isEmpty()){
            System.out.println("Выполнение: " + tasks.poll());
        }
    }
}
