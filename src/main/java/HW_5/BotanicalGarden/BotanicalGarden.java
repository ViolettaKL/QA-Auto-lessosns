package HW_5.BotanicalGarden;

public class BotanicalGarden {
    private Plant plant;
    void setPlant(Plant plant){
        this.plant = plant;
    }
    void maintainPlant(){
        plant.care();
    }
}
