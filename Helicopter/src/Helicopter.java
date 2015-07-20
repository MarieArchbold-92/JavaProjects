
public class Helicopter {

	//State
	private String type; //recon, attack, medivac, other
	private int numPassenger;
	private int numCrew;
	private double currentAltitude; // feet
	
	public static final double ALTITUDE_IN_METERS = 3.33D;
	
	//Behaviour
	

	public double getCurrentAltitudeInFeet(){
		return this.currentAltitude;
	}
	
	public void setCurrentAltitudeInFeet(double newAltitude){
		this.currentAltitude = newAltitude;
	}
	
	public double getCurrentAltitudeInMeters(){
		return this.getCurrentAltitudeInMeters() / ALTITUDE_IN_METERS;
	}
	
	public void setCurrentAltitudeInMeters(double newAlt){
		this.currentAltitude = newAlt;
	}
	
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String newType){
		this.type = newType;
	}
	
	public int getNumPassenger(){
		return this.numPassenger;
	}
	
	public void setNumPassenger( int newNumPassenger){
		this.numPassenger = newNumPassenger;
		
	}
	
	public int getNumCrew(){
		return this.numCrew;
	}
	
	public void setNumCrew(int newNumCrew){
		this.numCrew = newNumCrew;
	}
}
