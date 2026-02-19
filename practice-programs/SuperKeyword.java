class SuperKeyword{
	
	
	
	int x =10; //parent variable
	
	
	// parent constructor
	
	SuperKeyword(){
		
		System.out.println("Person Constructor Called");
	}
	
     void show(){
		 System.out.println("Person Method Called");
	 }
	
		
	
	
}

class Employee extends SuperKeyword{
	int x =20;
	Employee(){
	
	
	super();
	System.out.println("used super keyword: accesing parent variable"+ super.x);
	super.show();
	}
	
	
	
	
	public static void main(String[]args){
		
		Employee c = new Employee();
		
		
		
	}
}