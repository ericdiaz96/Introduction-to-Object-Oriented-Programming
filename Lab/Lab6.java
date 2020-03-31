import java.util.Scanner;
public class Lab6{
  public static int factorial(int n){
    int result=1;
    for(int i=1;i<=n;i++){
      result*=i;
    }
    return result;
  }
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Enter a number to compute its factorial: ");
    int n=keyboard.nextInt();
    System.out.println(n+"! is "+factorial(n));
  }
}
