/**
 * Demonstrating the use of enumerations 
 * @author Marie Archbold
 *
 */
public class TrafficColours {

	enum TrafficColor{RED, GREEN, AMBER};
	
	public static void main(String[] args) {
		TrafficColor col = TrafficColor.RED;
		
		if(col == TrafficColor.RED){
			System.out.println("Stop the lights");
		}
		else if(col == TrafficColor.GREEN){
			System.out.println("If clear and safe then go");
		}
		else if(col == TrafficColor.AMBER){
			System.out.println("Prepare to stop");
		}
		
		
		
		

	}

}
