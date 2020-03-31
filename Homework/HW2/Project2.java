import java.util.Scanner;
public class Project2
{
    public static void main (String [] args)
    {
    	//Scanner code
        Scanner keyboard = new Scanner (System.in);
        //Beginning of Program
        System.out.println ("Please enter a line of text.");
        //Declaration of Strings
        String sentence = keyboard.nextLine();
        //Declaration of integer,finds Index position of "hate"
        int position = sentence.indexOf("hate");
        //replaceFirst - replaces first occurence of the "hates"
        sentence = sentence.replaceFirst("hate","love");
        System.out.println ("I have rephrased that line to read:"+ sentence);
    }
}