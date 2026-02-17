class constructorExample{
	int id;
		String name;
		int age;
		
		
		public constructorExample(){
			System.out.println("Default constructor");
			
		}
		
		public constructorExample(int id,String name , int age){
			
			this.id = id;
			this.name = name;
			this.age = age;
			
		}
		
		void display(){
			System.out.println("ID:" + id);
			System.out.println("Name:" + name);
			System.out.println("Age" + age);
			
		}
	
	public static void main(String[]args){
		constructorExample cd = new constructorExample();
		constructorExample c = new constructorExample(1, "Harshit",18);
		c.display();
		
		
		
		
		
		
		
		
		
}
}