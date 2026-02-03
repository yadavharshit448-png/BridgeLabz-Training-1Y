import java.util.Scanner;
class arr2dSum{
	public static void main(String[]args){
		int row;
		int coloum;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of  rows");
		row = sc.nextInt();
		System.out.println("Enter  number of coloum");
		coloum = sc.nextInt();
		
		int arr[][] = new int[row][coloum];
		
		
		for(int i = 0; i<row;i++){
		
			for(int j=0;j<coloum;j++){
				System.out.println("Enter"+ i+","+j+"element");
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i = 0; i<row;i++){
		
			for(int j=0;j<coloum;j++){
				System.out.println(arr[i][j]);
				
				sum = sum + arr[i][j];
				
			}
			System.out.println();
			
		}
		System.out.println("sum is "+ sum);
		
		
		
		
		
		
		
		
	}
}
	