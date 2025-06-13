package HW_5.AmusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }
    public void operateAttraction(){
        attraction.maintain();
    }
    public void info(){
        attraction.info();
    }
}
