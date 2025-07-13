package HW_6.HashMap.Task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Marina", 30);
        ageMap.put("Ilya", 32);
        ageMap.put("Anna", 18);
        ageMap.put("Polina", 45);
        ageMap.put("Pavel", 28);

        System.out.println("Список имён и возрастов: ");
        for(Map.Entry<String, Integer> entry : ageMap.entrySet()){
            System.out.println("Имя: " + entry.getKey() + ", Возраст: " + entry.getValue());
        }
    }
}
