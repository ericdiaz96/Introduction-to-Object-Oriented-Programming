import java.util.Scanner;
public class Project1
{
    public static void main (String [] args)
    {
    	//Scanner code
        Scanner keyboard = new Scanner (System.in);
    	System.out.println ("This program converts degrees Fahrenheit to Celsius.");
        System.out.print ("Please enter a whole number temperature in degrees Fahrenheit:");
    	//Declaration of Integers
    	int Fahrenheit = keyboard.nextInt();
    	//Boolean Expression
    	System.out.println(Fahrenheit + " degrees Fahrenheit is " + (5.00*(Fahrenheit-32)/(9.0)) + " degrees Celsius.");
    }
}
}