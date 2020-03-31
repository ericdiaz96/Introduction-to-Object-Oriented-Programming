import java.util.Scanner;
public class ProgrammingProject2
{
    public static void main (String [] args)
    {
        System.out.println ("Hello, welcome to the Birthday Wizard.");
        System.out.println ("The Birthday Wizard calculates which year you turn the age that you input.");
        System.out.println ("Please enter your year of birth.");
        int year;
        Scanner keyboard = new Scanner (System.in);
        year = keyboard.nextInt ();
        System.out.println ("Enter the age in years you wish to know on a line:");
        int age;
        age = keyboard.nextInt ();
        System.out.println ("You will turn " + age + " in the year:");
        System.out.println (age + year);
    }
}