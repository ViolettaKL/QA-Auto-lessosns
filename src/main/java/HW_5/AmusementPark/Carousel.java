package HW_5.AmusementPark;

public class Carousel extends Attraction{
    @Override
    void info(){
        System.out.println("Спокойный аттракцион");
    }
    @Override
    void maintain(){
        System.out.println("Требует тех.обслуживания");
    }
}
