import java.util.Scanner;
public class calculator {

    int num1;
    int num2;
    void addition(int a , int b){
          System.out.println("addition is "+ (a+b));
    }
    void subtraction(int a , int b){
          System.out.println("subtraction is "+ (a-b));
    } 
    void multiplication(int a , int b){
          System.out.println("multiplication is "+ (a*b));
    }
    void division(int a , int b){
          System.out.println("division is "+ (a/b));
    }
    void modulus(int a , int b){
          System.out.println("modulus is "+ (a%b));
    }

    public static void main (String[] args){
       calculator calc = new calculator();
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number ");
          calc.num1 = sc.nextInt();
         System.out.println("Enter second number ");
         calc.num2 = sc.nextInt();
         calc.addition(calc.num1, calc.num2);
         calc.subtraction(calc.num1, calc.num2);
         calc.multiplication(calc.num1, calc.num2);
         calc.division(calc.num1, calc.num2);
         calc.modulus(calc.num1, calc.num2);

    }
}
