package HW_5.AmusementPark;

public class RollerCoaster extends Attraction{
    @Override
    void info(){
        System.out.println("Острые ощущения");
    }

    @Override
    void maintain() {
        System.out.println("Требует проверки безопасности");
    }
}
