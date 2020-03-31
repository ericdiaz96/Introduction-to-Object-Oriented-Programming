import java.util.Scanner;
public class ProgrammingProject3
{
    public static void main (String[]args)
    {
    
	System.out.println ("Hello, welcome to the Integer Wizard.");
    System.out.println ("The Integer Wizard takes two numbers that you input, and counts how many integers fall between the numbers you enter.");
   	int min, max;
  	Scanner keyboard = new Scanner(System.in);
   	System.out.println ("Enter a minimum and maximum value.");
   	min = keyboard.nextInt();
   	max = keyboard.nextInt();
  	System.out.println ("The number of values in the range from " + min + " to " + max + " is: ");
   	System.out.println (max - min + 1);
	}
}