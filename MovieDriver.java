import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String uInput;
		int uInputInt;
		boolean proceed=true;
		Scanner read=new Scanner(System.in);
		Movie newMovie=new Movie();
		while(proceed) {
		System.out.println("Enter the name of the movie:");
		 uInput=read.next();
		 newMovie.setTitle(uInput);
		System.out.println("Enter the rating of "+newMovie.getTitle()+":");
		 uInput=read.next();
		 newMovie.setRating(uInput);
		System.out.println("Enter number of tickets sold:");
		 uInputInt=read.nextInt();
		 newMovie.setSoldTickets(uInputInt);
		System.out.println(newMovie.toString());
		System.out.println("Do you wish to enter another move? (y/n)");
		uInput=read.next();
		if(uInput.equals("n")) {
			proceed=false;
		}
		else {
			proceed=true;
		}
		
		}
		System.out.println("Goodbye!");
	}
}
