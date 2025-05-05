package HW_6.Linked_Hash_Map.Task_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> names = new LinkedHashMap<>();
        names.put("Петя", 28);
        names.put("Витя", 27);
        names.put("Полина", 26);
        names.put("Костя", 25);
        names.put("Анна", 24);

        for (Map.Entry<String, Integer>entry : names.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
