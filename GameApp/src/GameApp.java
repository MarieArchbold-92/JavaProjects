import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		
		boolean playAgain = true;
		do{
			
		//Game menu
		System.out.println("How many games would you like to play?(0 to quit) : ");
		
		//Asking user how many lives they would like 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice here ---> ");
		int playerChoice = scan.nextInt();
		
		//Use if to check whether to keep playing the game 
		if(playerChoice == 0){
			playAgain = false;
		}
		
		//Print out choice
		System.out.println("Your choice is: " + playerChoice);
		
		//While loop 
		int numGames = playerChoice;
		while(numGames > 0){
		//Play game 
		System.out.println("Playing game...");
		--numGames;
		}
		
		System.out.println(numGames + "Lives left, Game Over!");
		
		} while(playAgain);
		

	}

}
