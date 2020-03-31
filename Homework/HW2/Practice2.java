import java.util.Scanner;
public class Practice2
{
    public static void main (String [] args)
    {
    	// Scanner Code
        Scanner keyboard = new Scanner (System.in);
    	System.out.println ("This program takes strings that you input and outputs the number of characters within a string.");
        System.out.println ("Please input two strings.");
        //Declaration of the strings
        String s1, s2, s3;
    	//String type inputs from the keyboard
    	s1=keyboard.next();
    	s2=keyboard.next();
        //Declaration of the integers
    	int n1, n2, n3;
    	n1 = s1.length();
    	n2 = s2.length();
    	//Printing strings and the characters.
    	System.out.println ("The first string inputted " + s1 + " contains " + n1 + " characters");
    	System.out.println ("The second string inputted " + s2 + " contains " + n2 + " characters");
    	
    	System.out.println ("I will now combine your two strings");
    	//Combining both strings with a space in between.
    	s3 = s1 + " " + s2;
    	n3 = s3.length();
    	System.out.println("The combined strings " + s3 + " contains " + n3 + " characters");
    	
    }
}