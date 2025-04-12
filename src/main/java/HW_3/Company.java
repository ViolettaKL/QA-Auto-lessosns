package HW_3;

public class Company {

    static String companyName = "Netflix";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company Name: " + companyName);
    }
}
