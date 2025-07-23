package HW_9.Task_2;

public class PrintCharacter  implements Runnable{
    private String character;

    public PrintCharacter(String character){
        this.character = character;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(character);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
