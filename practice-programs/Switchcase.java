import java.util.Scanner;

class Switchcase {
	
	
	public static void main (String[]args){
		int num;
		Scanner hy = new Scanner(System.in);
		
		System.out.println("enter the number ");
		
		num = hy.nextInt();
		
		
		switch(num){
			
			case 1 : System.out.println("Hello:>>>> ");
			break;
			
			case 2 : System.out.println("World :<<<<<<<<");
			break;
			
			case 3 : System.out.println("Gla is not that good ");
			break;
			
			
			default : System.out.println("heeeeelooooooooooo");
			break;
			
		}
		hy.close();
		
		
		
		
		
	}
}