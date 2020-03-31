import java.util.Scanner;
public class Practice5
{
    public static void main (String [] args)
    {
    	//Scanner code
        Scanner keyboard = new Scanner (System.in);
    	System.out.println ("This program converts degrees Fahrenheit to Celsius or\nCelsius to Fahrenheit.");
        System.out.print("Please enter temperature: ");
        int num = Integer.parseInt (keyboard.next());
        System.out.print("Please enter f to convert from Fahrenheit to Celsius. \nPlease enter c to convert from Celsius to Fahrenheit: ");
        
        //Declaration of the integers/ Declaring the scanner object.
        String temp = keyboard.next();
        //Celsius to Fahrenheit conversion
        {if (temp.equals("C") || temp.equals("c")){
        	//Calculating Fahrenheit 
        double degreeF = ((9.00*(num))/(5)+32);
        System.out.println("The Fahrenheit temperature is: " +degreeF + " F.");}
        else if(temp.equals("F") || temp.equals("f")){
        	//Calculating Celsius
        double degreeC = (5.00*(num-32)/(9.0));
        System.out.println("The Celsius temperature is: " + degreeC + " C.");}
    	else
    	System.out.println("An error has occurred.");
    	}
}
}