package HW_9.Task_1;

public class HelloThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Привет из потока!");
        }try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
