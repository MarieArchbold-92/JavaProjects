import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String grade = "0";
	String result;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a grade: ");
	grade = scan.next();
	
	switch(grade){
	
	case "A":  
				result = "85-100"; break;
	case "B":
				result = "70-84"; break;
	case "C": 
				result = "55-69"; break;
	case "D": 
				result = "40-54"; break;
	default:
				result = "fail";
	}
	
	System.out.println("Your result is: " + result);
	
	}

}
