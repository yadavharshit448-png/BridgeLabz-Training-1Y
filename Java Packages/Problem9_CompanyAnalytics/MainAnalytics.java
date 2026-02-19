import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainAnalytics {
    public static void main(String[] args) {
        System.out.println("Problem 9: Company Analytics with Sub-Packages");

        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        sales.generateReport();
        System.out.println();
        hr.generateReport();
        
        System.out.println("\nSub-Packages Explanation:");
        System.out.println("Packages 'com.company.analytics.sales' and 'com.company.analytics.hr' are independent.");
        System.out.println("Being sub-packages of 'com.company.analytics' DOES NOT give them special access to each other.");
        System.out.println("They are treated as completely different packages by the JVM.");
    }
}
