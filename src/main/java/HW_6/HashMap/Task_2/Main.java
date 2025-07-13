package HW_6.HashMap.Task_2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Marina", 30);
        ageMap.put("Ilya", 32);
        ageMap.put("Anna", 18);
        ageMap.put("Polina", 45);
        ageMap.put("Pavel", 28);

        String nameToCheck = "Anna";
        if(ageMap.containsKey(nameToCheck)){
            System.out.println(nameToCheck + " Найден с возрастом " + ageMap.get(nameToCheck));
        }else{
            System.out.println(nameToCheck + " Не найден");
        }
    }
}
