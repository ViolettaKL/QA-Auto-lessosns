package HW_6.HashMap.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Marina", 30);
        ageMap.put("Ilya", 17);
        ageMap.put("Anna", 16);
        ageMap.put("Polina", 18);
        ageMap.put("Pavel", 15);
        printUsersYoungerThan18(ageMap);
    }
    public static void printUsersYoungerThan18(HashMap<String, Integer> ageMap){
        System.out.println("Пользователи младше 18 лет: ");
        boolean found = false;
        for(Map.Entry<String, Integer> entry : ageMap.entrySet()){
            String name = entry.getKey();
            Integer age = entry.getValue();

            if(age < 18){
                System.out.println(name + " - " + age + " лет");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет пользователей младше 18 лет");
        }
    }
}
