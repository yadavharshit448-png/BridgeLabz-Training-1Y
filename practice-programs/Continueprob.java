import java.util.Scanner;

class Continueprob{
	
	public static void main (String[] args){
		
		int a ;
		
		Scanner qw = new Scanner(System.in);
		
		a = nextInt();
		
		for (int i = 0 ; i<=a;i++){
			
			if (i%2==0){
				
				continue;
			}
			System.out.println(i);
			
			
		}
		
	} 
}