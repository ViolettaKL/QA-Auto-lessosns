package HW_6.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> scoreMap = new TreeMap<>();
        scoreMap.put("Алиса", 87);
        scoreMap.put("Анна", 100);
        scoreMap.put("Лариса", 65);
        scoreMap.put("Полина", 77);
        scoreMap.put("Мария", 56);

        for (Map.Entry<String, Integer> entry :
        scoreMap.entrySet()){
            System.out.println("Имя: " + entry.getKey() + ", Баллы: " + entry.getValue());
        }
    }
}
