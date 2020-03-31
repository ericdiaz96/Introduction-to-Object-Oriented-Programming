import java.util.Scanner;
public class PP2
	{
		public static void main (String[]args)
		{
			//Declaration of Integers
			int small, medium, large;
			Scanner keyboard = new Scanner (System.in);
			System.out.println ("This program reads three numbers that you input \nand prints them out in ascending order.");
			System.out.println ("Please enter three different positive integers.");
			//Initialization of Integers
			small = 0;
			medium = 0;
			large = 0;
			int n1 = keyboard.nextInt();
			int n2 = keyboard.nextInt();
			int n3 = keyboard.nextInt();
			//Else-if statements
			if (n1 < 0 || n2 < 0 || n3 < 0){
				System.out.println("Error, do not input negative integers.");
				System.exit(0);
			//Identification of the Small integer
			}{if (n1< n2 && n1<n3)
				small= n1;
			else if (n2<n1 && n2<n3)
				small= n2;
			else if (n3<n1 && n3<n2)
				small= n3;
			else
				small= 0;}
			//Identification of large integer
			{if (n1>n2 && n1>n3)
				large= n1;
			else if (n2>n1 && n2>n3)
				large= n2;
			else if (n3>n1 && n3>n2)
				large= n3;
			else large=0;}
			//Identification of Medium integer
			if ((n1<n2 && n1>n3) || (n1>n2 && n1<n3))
				medium= n1;
			else if ((n2<n1 && n2>n3) || (n2>n1 && n2<n3))
				medium= n2;
			else if ((n3<n1 && n3>n2) || (n3>n1 && n3<n2))
				medium= n3;
			else 
				medium = 0;
			
			System.out.println ("The integers in ascending order are: "+ small + ", " + medium + ", " + large +"." );
	}
}