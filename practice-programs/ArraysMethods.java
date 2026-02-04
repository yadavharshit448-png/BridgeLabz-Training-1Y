import java.util.Arrays;

class ArraysMethodS{


public static void main (String[]args){
	int num[] = {1,2,3,4,45};
	
	int index = Arrays.binarySearch(num,45);
	
	System.out.println("the index of 45 is " + index);
	System.out.println(Arrays.toString(num));
	
	int[] arr3 = new int[100];
	
	
	Arrays.fill(arr3,7);
	System.out.println(Arrays.toString(arr3));
	
	
	
	
}

}