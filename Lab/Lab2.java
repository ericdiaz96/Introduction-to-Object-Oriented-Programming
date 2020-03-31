import java.util.Scanner;
public class Lab2
{
    public static void main (String [] args)
    {
        System.out.println ("Hello out there.");
        System.out.println ("I will take the average of three numbers that you input.");
        System.out.println ("Please enter three numbers on the line.");
        float n1, n2, n3;
        Scanner keyboard = new Scanner (System.in);
        n1 = keyboard.nextInt ();
        n2 = keyboard.nextInt ();
        n3 = keyboard.nextInt ();
        System.out.println ("The average of those three numbers is");
        System.out.println ((n1 + n2 + n3)/ 3);
    }
}