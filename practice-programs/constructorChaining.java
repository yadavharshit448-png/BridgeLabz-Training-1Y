class constructorChaning{
	int id;
	String model;
	String engine;
	
	
	constructorChaning(){
		
		this(1,"audi","v8");
		System.out.println("printing Car details");
		
		
	}
	
	constructorChaning( int id , String model , String engine ){
		this.id=id;
		this.model=model;
		this.engine=engine;
	}
	
	void display(){
		System.out.println("id " + id);
		System.out.println("model " + model);
		System.out.println("engine " + engine);
		
	}
	
	
	
	
	
	public static void main(String[]args){
		
		
		constructorChaning c = new constructorChaning();
		//constructorChaning cd = new constructorChaning(1,"audi","v6");
		c.display();
		
		
		
	}
	
	
	
	
	
	
	
}