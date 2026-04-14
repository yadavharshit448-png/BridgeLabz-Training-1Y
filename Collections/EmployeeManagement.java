
import java.util.ArrayList;

class Employee{
    private String name;
    private int id;
    private String email;


    public Employee(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
   
     this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
    }


}
public class EmployeeManagement{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "john.doe@example.com");
        Employee emp2 = new Employee("harshit", 1,"pro@gmail.com");
        
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println("Employee List:");
        for(Employee emp : employees){
            System.out.println(emp);
        }
        Employee updatedEmp = new Employee("noobdi",0,"noob@gmail.com");
        employees.set(0, updatedEmp);
        System.out.println("\nUpdated Employee List:");
        for(Employee emp : employees){
            System.out.println(emp);
        }

    }
}