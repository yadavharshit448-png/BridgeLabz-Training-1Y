class GenericsMethod{

    public static<T> void swap(T a , T b ){
        System.out.println("Before swap: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public static void fibonacci( int n){
        int  a = 0;
        int b = 1;
        int  c ;
        System.out.print("Fibonacci series: ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(a + " ");
            c = a + b ;
            a = b ;
            b = c ;
        } 
    }    

public static void main(String[] args) {
        fibonacci(10);
        swap(11, 15);
        swap("meow", "purr");
    }
}   