import java.util.Scanner;
public class Project8c
{
	public static void main (String[]args)
	{
		System.out.println ("If you are a man, then press 1. If you are a woman press 2.");
		Scanner keyboard2 = new Scanner (System.in);
		int type = keyboard2.nextInt();
			switch (type) {
		//Switch case used here t make the different calc for the man and woman.
				case 1:
				Scanner keyboard = new Scanner (System.in);
				double bmr, n1, n2, n3;
				int bar;
				System.out.println("Enter your weight in pounds.");
				n1 = keyboard.nextInt();
				
				System.out.println("Enter your height in inches.");
				n2 = keyboard.nextInt();
				
				System.out.println("Enter your age in years.");
				n3 = keyboard.nextInt();
				
				//BMR calculation
				bmr = 66+(6.3*n1)+(12.9*n2)-(6.8*n3);
				bar = (int)(bmr/230);
				System.out.println("The number of chocolate bars you can consume to maintain your weight is " + bar);
				break;
				case 2:
				Scanner keyboard1 = new Scanner (System.in);
				double bmr1, n4,n5,n6;
					int bar1;
					System.out.println("Enter your weight in pounds.");
					n4 = keyboard1.nextInt();
					
					System.out.println("Enter your height in inches.");
					n5 = keyboard1.nextInt();
					
					System.out.println("Enter your age in years.");
					n6 = keyboard1.nextInt();
					
					bmr1 = 655+(4.3*n4)+(4.7*n5)-(4.7*n6);
					bar1=(int)(bmr1/230);
					System.out.println("The number of chocolate bars you can consume to maintain your weight is " + bar1);
				break;
			}
}
}