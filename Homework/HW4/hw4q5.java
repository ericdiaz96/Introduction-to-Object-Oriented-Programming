import java.util.Scanner;
public class hw4q5
 {
		public static void main(String[] args)
 {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the size of a triangle from 1 to 50.");
		int number = keyboard.nextInt();
			String s = "";
		for(int i = 0 ; i < number * 2 - 1; i++) {
    		s = i < number ? s + "*" : s.substring(1);
    		System.out.println(s);
}
}
}