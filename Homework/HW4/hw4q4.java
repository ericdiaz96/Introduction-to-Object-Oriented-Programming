import java.util.Scanner;
public class hw4q4
 {
		public static void main(String[] args)
 {
			int A_grades = 0;
        	int B_grades = 0;
        	int C_grades = 0;
        	int D_grades = 0;
        	int F_grades = 0;
        	int count=0;
        	Scanner keyboard = new Scanner(System.in);
        	System.out.println("Enter exam score as integer percentage in range 0 to 100 :");
        	int score = keyboard.nextInt();
        	
 			while(score>0){
       		count++;
 			if(score>=90 && score<=100)
        	A_grades++;
    		else if(score>=80 && score<=89)
        	B_grades++;
    		else if(score>=70 && score<=79)
        	C_grades++;
    		else if(score>=60 && score<=69)
        	D_grades++;
    		else if(score>=0 && score<=59)
        	F_grades++;
    		System.out.println("Enter exam score as integer percentage in range 0 to 100 :");
 			score = keyboard.nextInt();} //end while
 			System.out.println("Total number of grades :"+ count);
 			System.out.println("Total number of A grades :"+ A_grades);
 			System.out.println("Total number of B grades :"+ B_grades);
			System.out.println("Total number of C grades :"+ C_grades);
 			System.out.println("Total number of D grades :"+ D_grades);
 			System.out.println("Total number of F grades :"+ F_grades);
 } // end main
 }