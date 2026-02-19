import com.bank.util.InterestCalculator;

public class MainBank {
    public static void main(String[] args) {
        System.out.println("Problem 7: Banking System with Static Import");

        InterestCalculator calculator = new InterestCalculator();
        
        double principal = 10000;
        double rate = 5.0; // 5%
        double time = 2; // 2 years

        double si = calculator.calculateSimpleInterest(principal, rate, time);
        double ci = calculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        
        System.out.println("\nSimple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
