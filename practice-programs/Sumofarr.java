import java.util.Scanner;
class Sumofarr{
	
	
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum = 0;
		
		for(int i = 0; i<size;i++){
			System.out.println("Enter" + i +  " element");
			 arr[i]= sc.nextInt(); 
			
			
			
			
		}
		for(int j =0; j<size;j++){
			System.out.println(arr[j]);
			
			sum = sum + arr[j];
			
			
		}
		System.out.println("sum is " + sum);
		
		
		
		
		
		
		
		
}
}