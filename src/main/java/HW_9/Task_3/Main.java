package HW_9.Task_3;

import javax.swing.plaf.IconUIResource;

import static HW_9.Task_3.VolatileExample.stop;
import static HW_9.Task_3.VolatileExample.counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread counterThread = new Thread(() -> {
            while(!stop){
                counter++;
            }
        });

        counterThread.start();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = true;
        counterThread.join();
        System.out.println("Значение счетчика: " + counter);
    }
}
