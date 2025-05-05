package HW_6.Hash_Map.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Иван", 30);
        names.put("Борис", 17);
        names.put("Марина", 16);
        names.put("Лена", 18);

        for (Map.Entry<String, Integer> entry : names.entrySet()){
            if (entry.getValue() < 18){
                System.out.println(entry.getKey() + " меньше 18 лет");
            }
        }
    }
}
