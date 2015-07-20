import java.util.Random;

public class HelicopterApp {

	public static void main(String[] args) {
		
		String[] type = new String[]{"Attack", "Drone", "Troop carrier", "Scout", "Medivac"};
		Random chopperr = new Random();
		System.out.println(type[chopperr.nextInt(5)]);
		Helicopter chopper = new Helicopter();
		
		System.out.println("Altitude is: " + "" + chopper.getCurrentAltitudeInFeet());
		chopper.setCurrentAltitudeInFeet(1000.0D);
		System.out.println("Altitude is: " + "" + chopper.getCurrentAltitudeInFeet());

		
		
		System.out.println("Helicopter type is: " + "" + chopper.getType());
		chopper.setType("Attack");
		System.out.println("Helicopter type is: " + "" + chopper.getType());
		
		System.out.println("Number of passengers is : " + "" + chopper.getNumPassenger());
		chopper.setNumPassenger(8);
		System.out.println("Number of passengers is : " + "" + chopper.getNumPassenger());
		
		System.out.println("Number of crew is: " + "" + chopper.getNumCrew());
		chopper.setNumCrew(5);
		System.out.println("Number of crew is: " + "" + chopper.getNumCrew());
	}

}
