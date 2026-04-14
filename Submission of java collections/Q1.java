import java.util.*;

pubilc class Q1{
	
	public static void main(String[]args)
	{
	
         LinkedList<Integer> l = new LinkedList<>();
         Scanner sc = new Scanner(System.in);
          System.out.println("enter number of elements");
		  int n = sc.nextInt();
		  System.out.println("enter elements");
		  for( int i = 0; i<n;i++){
			  int x = sc.nextInt();
			  l.add(x);
		  }
		  for(int i =0 ;l.length;i++){
			  int temp = l[i];
			  l[i]=l[i+1]
			  l[i+1]=temp;
		  }
           		  
	
	}
	
		
		
}