import java.util.Scanner;
 
 
public class Profanity
{
        public static void main(String[] args)
        {
        		System.out.println("This program detects strings with the word cat, dog, & llama \nand labels it as profanity.");
        		System.out.println("Please enter a sentence.");
                String input = getInput();
               
                String manipulate = input.toLowerCase();
               
                manipulate = removePunctuation(manipulate);
               
                profanityChecker(manipulate);
               
        }
       
        private static String getInput()
        {
                Scanner key = new Scanner(System.in);
                String input = key.nextLine(); //get our input
                key.close();
                return input;
        }
 
        private static String removePunctuation(String manipulate) //remove any punctuation to avoid: "cat."
        {
               
                String[] punctuation = {".",",","?","!","\""};
                for (String p: punctuation)
                        if(manipulate.indexOf(p) >= 0)
                                manipulate = manipulate.replaceAll("\\" + p, ""); // "?" is a reserved character and will incite a 'PattenSyntaxException'. Use "\\?" instead
                       
               
               
                return manipulate;
        }
 
        private static void profanityChecker(String manipulate) //checks for profanity
        {
               
                String[] profanity = {"cat", "dog", "llama", "cats", "dogs", "llamas"};
                String[] man = manipulate.split(" ");
                boolean isThereProfanity = false;
               
                for (String m: man)
                        for(String p: profanity)
                                if(m.equals(p)) //if the word in the sentence that resembles any of these profane words, then set the boolean to TRUE
                                        isThereProfanity = true;
               
                if (isThereProfanity) System.out.println("There is profanity.");
                else System.out.println("Nothing profane here");
        }
}