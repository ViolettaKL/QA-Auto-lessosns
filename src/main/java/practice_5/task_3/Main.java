package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Zoo zooOfTexas = new Zoo();

        Bird calibri = new Bird();

        //добавили в зоопарк птицу калибри
        zooOfTexas.addAnimal(calibri);
        zooOfTexas.forceMakeSound();
        zooOfTexas.forceMakeMove();

        //смена животного на слона
        Elephant elephant = new Elephant();
        zooOfTexas.removeAnimal();
        zooOfTexas.addAnimal(elephant);
        zooOfTexas.forceMakeSound();
        zooOfTexas.forceMakeMove();
    }
}
