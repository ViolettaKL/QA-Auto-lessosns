package HW_5.AmusementPark;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();
        RollerCoaster rollerCoaster = new RollerCoaster();
        amusementPark.setAttraction(rollerCoaster);
        amusementPark.info();
        amusementPark.operateAttraction();
    }
}
