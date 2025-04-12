package HW_2;

public class Teacher {
    public String name;
    public String subject;

    Teacher(String name,String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void printInfo(){
        System.out.println("Учитель: " + this.name + " Предмет: " + this.subject);
    }
}
