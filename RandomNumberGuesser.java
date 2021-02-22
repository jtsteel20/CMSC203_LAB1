import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 2/23/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Justin Steele
*/

public class RandomNumberGuesser {
//Guessing Game that Generates a random number and makes the user guess what it is
	static int randNum;
	static int nextGuess=-1;
	static int lowGuess=0;
	static int highGuess=100;
	
	public static void main(String[] args) {
		boolean playAgain=true;
		Scanner rl=new Scanner(System.in);
		randNum=RNG.rand();
		while(playAgain) { //General Play Loop
		System.out.println("Make your first Guess:");
			while(nextGuess!=randNum) { //Loop for every individual game
				System.out.println("Guess Must be between "+lowGuess+" and "+highGuess);
				nextGuess=rl.nextInt();
					if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) { //checks to see if valid
						if(nextGuess<randNum) { //checks if too high
							System.out.println("Guess Was too low");
							lowGuess=nextGuess;
						}
						else if(nextGuess>randNum){ //checks if too low
							System.out.println("Guess Was too high");
							highGuess=nextGuess;
						}
				
					}
					System.out.println("Number of Guesses: "+RNG.getCount());
					System.out.println("Enter your next Guess:");
			}
	
			System.out.println("Congratulations, you guessed correctly!");
			System.out.println("Do you want to play again? (y/n)");
			if(rl.next().equals("y")) { playAgain=true;}
			else{ 
				System.out.println("Thanks For Playing!\nCode by: Justin Steele");
				playAgain=false;
			}
		}
	}
}