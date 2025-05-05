package HW_6.Hash_Map.Task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("Петя", 20);
        employee.put("Катя", 23);
        employee.put("Маша", 24);
        employee.put("Коля", 25);
        employee.put("Витя", 26);

        for (Map.Entry<String, Integer> entry : employee.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() + " лет");
        }
    }
}
