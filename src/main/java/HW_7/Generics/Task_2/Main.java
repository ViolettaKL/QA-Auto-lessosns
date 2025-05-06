package HW_7.Generics.Task_2;

public class Main {
    public static  <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};
        String[] strArray = {"Коля", "Петя", "Марина"};
        printArray(strArray);
        printArray(intArray);
    }
}
