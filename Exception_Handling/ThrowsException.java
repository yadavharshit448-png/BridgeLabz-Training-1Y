public class ThrowsException{
public static void test1(int a){ 




if (a<0){
throw new ArithmeticException("negative numbers are not allowed");

}
else{
  System.out.println("methond ran");
}


}
public static void test() throws ArithmeticException{

  System.out.println(5/0);
  
  
}



public static void main (String[]args){




try{test();
}

catch (ArithmeticException e){
 System.out.println("dem");

}
finally{

  test1(-2);
}


}






}
