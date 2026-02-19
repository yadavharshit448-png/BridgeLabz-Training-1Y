class StudentData{
	
	private int marks;
	
	
	
	public void setMarks(int m){
		if(m>=0){
			marks =m;
		}
			
	}
	
	//getter method (read data
	public int getMarks(){
		
		return marks;
	}
	
	
	
}

public class EncapsulationExample{
	
	public static void main(String[]args){
		
		StudentData s = new StudentData();
		s.setMarks(90);
		System.out.println(s.getMarks());
		
		
	}
	
}
