package HW_9.Task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new PrintCharacter("A"));
        Thread threadB = new Thread(new PrintCharacter("B"));

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }
}
