package HW_6.Tree_Map.Task_2;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(12, "Марина");
        students.put(23, "Анна");
        students.put(33, "Петя");
        students.put(43, "Виктория");
        students.put(53, "Коля");

        System.out.println("Самый маленький ключ: " + students.firstKey());
        System.out.println("Самый большой ключ: " + students.lastKey());
    }
}
