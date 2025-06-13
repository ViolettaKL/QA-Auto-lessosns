package HW_5.Museum;

public class Manuscript implements Exhibit {
    @Override
    public void describe(){
        System.out.println("Древний текст");
    }
    @Override
    public void preserve(){
        System.out.println("Требует контроля влажности");
    }
}
