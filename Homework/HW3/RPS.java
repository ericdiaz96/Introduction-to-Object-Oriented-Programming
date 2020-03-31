import java.util.Scanner;
public class RPS
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		//String Declaration
		String p1, p2;
		
		System.out.println("This program is a two-player Rock, Paper, Scissors game.");
		System.out.println("Player One - please type R, P, or S.");
		p1 = keyboard.next();
		System.out.println("Player Two - please type R, P, or S.");
		p2 = keyboard.next();
		//Boolean Declaration
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
	
		//If statement
		if (p1.contains("r") && p2.contains("r") || p1.contains("p") && p2.contains("p") || p1.contains("s") && p2.contains("s")){
			System.out.println("Nobody wins, it's a tie.");
		}
		else if (p1.contains("r") && p2.contains("p") || p1.contains("p") && p2.contains("r"))
			System.out.println("Paper covers rock.");
		else if (p1.contains("r") && p2.contains("s") || p1.contains("s") && p2.contains("r"))
			System.out.println("Rock breaks scissors.");
		else if (p1.contains("s") && p2.contains("p") || p1.contains("p") && p2.contains("s"))
			System.out.println("Scissors cuts paper.");
		else
			System.out.println("Error - please rerun program.");
	}
}