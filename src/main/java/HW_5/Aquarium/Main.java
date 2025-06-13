package HW_5.Aquarium;

public class Main {
    public static void main(String[] args) {
        AquariumSystem aquariumSystem = new AquariumSystem();
        SeaCreature creature = new Shark();
        aquariumSystem.setCreature(creature);
        aquariumSystem.move();

        SeaCreature creature1 = new StarFish();
        aquariumSystem.setCreature(creature1);
        aquariumSystem.move();
    }
}
