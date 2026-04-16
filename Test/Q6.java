public class Q6 {
    
  
    static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle d > n
        
      
        int[] temp = new int[d];
        
  
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
       
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        
   
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int d = 3; 
        
        System.out.println("Original array:");
        displayArray(arr);
        
        rotateLeft(arr, d);
        
        System.out.println("Array after left rotation by " + d + " positions:");
        displayArray(arr);
    }
}