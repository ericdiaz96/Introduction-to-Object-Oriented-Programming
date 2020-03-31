import java.util.Scanner;
public class Lab3
{
    public static void main (String [] args)
    {
        System.out.println("This program identifies whether a number you enter is an even or an odd number.");
        System.out.println("Please enter a number.");
        Scanner keyboard = new Scanner (System.in);
        float n1;
        n1 = keyboard.nextInt ();
        if (n1 % 2 == 0) System.out.println("Even"); else System.out.println("Odd");
    }
}