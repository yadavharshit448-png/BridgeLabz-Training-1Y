class markerClass implements marker {
	
	String name = "Ravi";
	
	public static void main (String[]args){
		
		markerClass s = new markerClass();
		
		if(s instanceof marker){
			System.out.println("marked class - special permission given");
			
		}else {
			System.out.println("not marked");
		}
	}
}