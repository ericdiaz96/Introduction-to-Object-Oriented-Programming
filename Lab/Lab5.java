import java.util.Scanner;
public class Lab5
	{
		public static void main (String[]args)
		{
			//Declaration of Integers
			int n1, n2, sum;
			Scanner keyboard = new Scanner (System.in);
			System.out.println("Please input positive integers.\nAs soon as a negative number is detected it will add them:");
			n1 = keyboard.nextInt();
			sum = 0;
			do {sum = sum + n1;
			n1 = keyboard.nextInt();}
        	while (n1 >=0);{
        	System.out.println ();
        	System.out.println (sum);
        	}
}
}
