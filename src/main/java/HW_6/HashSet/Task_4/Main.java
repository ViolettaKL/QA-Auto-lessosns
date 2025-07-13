package HW_6.HashSet.Task_4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("Jonh");
        nameSet.add("Liza");
        nameSet.add("Polina");
        nameSet.add("Anna");
        nameSet.add("Bob");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String yourName = scanner.nextLine();

        if(nameSet.contains(yourName)){
            System.out.println("Ваше имя есть в списке");
        }else{
            System.out.println("Ваше имя отсутствует в списке");
        }
        scanner.close();
    }
}
