package HW_6.TreeSet.Task_2;

import java.util.TreeSet;

public class TreeSetExample {
    private TreeSet<Integer> numbers;
    public TreeSetExample(){
        numbers = new TreeSet<>();
    }
    public void addNumber(int number){
        if(numbers.contains(number)){
            System.out.println("Дубликат не может быть добавлен " + number);
        }else{
            numbers.add(number);
            System.out.println("Число добавлено " + number);
        }
    }
    public void printNumbers(){
        System.out.println("Элементы TreeSet: " + numbers);
    }
}
