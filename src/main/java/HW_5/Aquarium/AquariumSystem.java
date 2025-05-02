package HW_5.Aquarium;

public class AquariumSystem {
    private SeaCreature creature;

    void setCreature(SeaCreature creature){
        this.creature = creature;
    }

    void move(){
        System.out.println(creature.move());
    }

}
