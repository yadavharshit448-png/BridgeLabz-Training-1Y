class MethodOverloading{
	
	
	static int addition(int a , int b){
		
		return a+b;
	}
	
	static double addition(double a , double b){
		
		return a+b;
	}
	
	
	public static void main(String[]args){
		
		int a =addition(5,5);
		double b =addition(5.5,5.6);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}