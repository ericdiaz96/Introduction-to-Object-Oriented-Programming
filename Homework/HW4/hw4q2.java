import java.util.Scanner;
public class hw4q2
 {
    	public static boolean isPalindrome(String word)
    {
    		//Bolean if statement that detects if it is a Palindrome
        	boolean isPalindrome = true;
        //
        	for(int i = 0;i<(int)word.length()/2;i++)
        {
            	if(word.charAt(i) != word.charAt(word.length()-1-i)){
                	isPalindrome = false;
                break;
                
            }
        }
            
        return isPalindrome;
    }
    public static void main(String[] args) {
        System.out.println("Enter a palindrome or just a normal string.");
        Scanner keyboard =new Scanner(System.in);
        String Input = keyboard.next();  
        System.out.println(isPalindrome(Input)?"Yes":"No");
        
    }
}