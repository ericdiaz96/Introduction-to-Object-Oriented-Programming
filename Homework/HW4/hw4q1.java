import java.util.Scanner;
public class hw4q1
 {
		public static void main(String args[]){
			System.out.println("Enter a string to count the individual words");
			Scanner keyboard = new Scanner(System.in);
			String s1= keyboard.nextLine();

			String words[] = s1.split(" ");
				int count=0;

				for(int i=0;i<words.length;i++)
				{
					String word= words[i]; count++;
				}

			System.out.println("The number of words in the given string are "+count);

}
}