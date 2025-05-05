package HW_6.Tree_Map.Task_1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Марина", 87);
        scores.put("Анна", 78);
        scores.put("Полина", 89);
        scores.put("Витя", 65);
        scores.put("Петя", 98);

        for (Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
