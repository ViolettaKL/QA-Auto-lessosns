package HW_7.Task_1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
        public static void readFile(){
            try{
                FileReader file = new FileReader("data.txt");
            }catch(FileNotFoundException e){
                System.out.println("Файл не найден");
            }
        }

    public static void main(String[] args) {
        readFile();
    }
}
