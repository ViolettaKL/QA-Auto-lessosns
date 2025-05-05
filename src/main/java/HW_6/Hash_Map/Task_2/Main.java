package HW_6.Hash_Map.Task_2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> searchName = new HashMap<>();
        searchName.put("Аня", 28);
        searchName.put("Егор", 27);
        searchName.put("Маша", 26);

        String name = "Катя";
        if (searchName.containsKey(name)){
            System.out.println("Запись " + name + " найдена");
        }else {
            System.out.println("Запись " + name + " не найдена");
        }
    }
}
