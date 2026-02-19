package gla.department;

public class Department {
    private String deptName;
    private String hodName;

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void display() {
        System.out.println("--- Department Details ---");
        System.out.println("Department: " + deptName);
        System.out.println("HOD: " + hodName);
    }
}
