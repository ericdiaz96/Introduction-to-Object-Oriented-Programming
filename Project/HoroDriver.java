import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class HoroDriver
{
 public static void main(String[] args) {


  Scanner keyboard = new Scanner(System.in);
  horoscopes x = new horoscopes();
  horoscopes y = new horoscopes();
  System.out.println("Please enter two birthdays to see their compatibility: " );
  int newMonth = keyboard.nextInt();
  int newDay = keyboard.nextInt();
  String s1 = x.getHoro(newMonth, newDay);
  int newMonth2 = keyboard.nextInt();
  int newDay2 = keyboard.nextInt();
  String s2 = y.getHoro(newMonth2, newDay2);
  
  
  compatibility x1 = new compatibility();
  x1.getSignIndex(s1);
  x1.getSignIndex(s2);
  
  x1.isCompatible(s1, s2);
  boolean result = x1.isCompatible(s1,s2);
  if (result){
 	   System.out.println("You are compatible!");
  }else{
      System.out.println("You are not compatible!");
  }
  
  String line = "";
  int lineNo;
  try {
   FileReader fr = new FileReader("C:/java/thanks.txt");
   BufferedReader br = new BufferedReader(fr);
   for (lineNo = 1; lineNo < 10; lineNo++) {
    if (lineNo == 1) {
     line = br.readLine();
    } else
     br.readLine();
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
  System.out.println(line);
 }
}
