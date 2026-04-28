abstract class Checkpoint {
	String checkpointId;
	String locationName;
	double distancefromlast;
	int expectedDuration;
	int actualDuration;
	
	public Checkpoint(String id , String Name , int distance ,int expected , int actual){
		this.checkpointId = id;
		this.locationName = Name;
		this.distancefromlast = distance;
		this.expectedDuration = expected;
		this.actualDuration = actual;
		
	}
}