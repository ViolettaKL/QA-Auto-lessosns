package HW_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName){
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public  void printStudentInfo(){
        System.out.println("Имя студента: " + studentName + ", ID: " + studentID + ", Университет: " + universityName);
    }
}
