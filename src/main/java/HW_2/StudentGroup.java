package HW_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    void printInfo(){
        System.out.println("Группа: " + this.groupName + " Количество студентов: " + this.studentCount);
    }
}
