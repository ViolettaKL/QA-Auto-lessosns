package HW_5.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zooOfTexas = new Zoo();
        Bird calibri = new Bird();

        zooOfTexas.addAnimal(calibri);
        zooOfTexas.forceMakeSound();
        zooOfTexas.forceMakeMove();

    }
}
