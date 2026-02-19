import com.access.one.Base;
import com.access.two.Derived;

public class AccessTest {
    public static void main(String[] args) {
        System.out.println("Problem 8: Access Modifier Control");
        
        Base base = new Base();
        // base.testAccess(); // Uncomment to see all work internally

        Derived derived = new Derived();
        derived.testAccessFromSubclassIndifferentPackage();
        
        System.out.println("\nAccess Modifier Summary Table:");
        System.out.println("| Modifier  | Class | Package | Subclass | World |");
        System.out.println("|-----------|-------|---------|----------|-------|");
        System.out.println("| public    | Yes   | Yes     | Yes      | Yes   |");
        System.out.println("| protected | Yes   | Yes     | Yes      | No    |");
        System.out.println("| default   | Yes   | Yes     | No       | No    |");
        System.out.println("| private   | Yes   | No      | No       | No    |");
    }
}
