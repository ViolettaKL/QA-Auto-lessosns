package HW_5.BotanicalGarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Cactus cactus = new Cactus();
        botanicalGarden.setPlant(cactus);
        botanicalGarden.maintainPlant();
    }
}
