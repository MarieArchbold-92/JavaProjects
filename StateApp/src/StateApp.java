import java.util.Scanner;

public class StateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22;
		System.out.println("Initial age is: " + age);

		//Post increment and decrement
		age++;
		System.out.println("Age is: " + age);
		age--;
		System.out.println("Age is: " + age);

		//Pre increment and decrement
		++age;
		System.out.println("Pre increment age is: " + age);
		--age;
		System.out.println("Pre decrement age is: " + age);

		//Print message if age is over 18 and less than 200 
		if((age >= 18) && (age <= 200)){
			System.out.println("Welcome");
		}

		//Get user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int option = scan.nextInt();

		

	
			if(option == 1){
				System.out.println("Please enter your name: ");
				String name = scan.next();
				System.out.println("Hello " + name);
			
			}
			

			if(option == 2){
				
				System.out.println("Please enter your age: ");
				int userAge = scan.nextInt();
				System.out.println("Your age is: " + userAge);
				
				}
				
			if(option == 3){
				System.out.println("Quit");
			}
			}
			
		}
	


