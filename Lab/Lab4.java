import java.util.Scanner;
public class Lab4
	{
		public static void main (String[]args)
		{
			//Declaration of Integers
			int small;
			Scanner keyboard = new Scanner (System.in);
			System.out.println ("This program reads three numbers that you input \nand prints out the smallest integer.");
			System.out.println ("Please enter three different positive integers.");
			//Initialization of Integers
			small = 0;
			int n1 = keyboard.nextInt();
			int n2 = keyboard.nextInt();
			int n3 = keyboard.nextInt();
			//Else-if statements
			if (n1 < 0 || n2 < 0 || n3 < 0){
				System.out.println("Error, do not input negative integers.");
				System.exit(0);
			}else if (n1< n2 && n1<n3)
				small= n1;
			else if (n2<n1 && n2<n3)
				small= n2;
			else if (n3<n1 && n3<n2)
				small= n3;
			else
				small= 0;
			System.out.println ("The smallest number that was inputted was: "+ small);
	}
}