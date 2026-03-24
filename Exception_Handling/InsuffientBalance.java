
import java.util.Scanner;
public class Test {
static Scanner sc=new Scanner(System.in);
public static void checkNum() throws ArithmeticException{
System.out.println("Enter your number: ");
int num=sc.nextInt();
if(num<0){
throw new ArithmeticException("Negative num not allowed");
}else{
System.out.println("Your number: "+num);
}
}
public static void main(String[] args){
try{
checkNum();
}catch (ArithmeticException e){
System.out.println("Not a valid num");
}
}
}