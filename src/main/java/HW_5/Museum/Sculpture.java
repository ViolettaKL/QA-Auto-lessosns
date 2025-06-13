package HW_5.Museum;

public class Sculpture implements Exhibit{
    @Override
    public void describe(){
        System.out.println("Скульптурный объект");
    }
    @Override
    public void preserve(){
        System.out.println("Требует реставрации");
    }
}


