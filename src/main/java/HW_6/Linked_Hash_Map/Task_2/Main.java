package HW_6.Linked_Hash_Map.Task_2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Петя", "654-678-643");
        phoneBook.put("Анна", "654-678-467");
        phoneBook.put("Коля", "654-678-245");
        phoneBook.put("Полина", "654-678-354");
        phoneBook.put("Маша", "654-678-806");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)){
            System.out.println(name + " " + phoneBook.get(name));
        }else {
            System.out.println("Контакт не найден");
        }
        scanner.close();

    }
}
