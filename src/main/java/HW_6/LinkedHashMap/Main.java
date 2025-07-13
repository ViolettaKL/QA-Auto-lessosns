package HW_6.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Первый", 1);
        map.put("Второй", 2);
        map.put("Третий", 3);
        map.put("Четвертый", 4);
        map.put("Пятый", 5);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
