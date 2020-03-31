import java.util.Scanner;
public class Problem3
{
	public static void main (String[] args)
	{
		System.out.println ("Enter two numbers to multiply.");
		int n1, n2;
		Scanner keyboard = new Scanner (System.in);
		n1=keyboard.nextInt();
		n2=keyboard.nextInt();
		int product = n1 * n2;
		System.out.println ("The product is");
		System.out.println (n1 * n2);
	}
}