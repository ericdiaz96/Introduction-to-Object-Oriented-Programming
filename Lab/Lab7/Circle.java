import java.util.Scanner;
public class Circle{
  private String setColor, color, inC;
  private double setRadius, radius, inR;
  private double circleArea;
  private double circumference;
  public double pi = 3.14159265;
  public void setColor(String inC){
  	color = inC;
  	}
  public void setRadius (double inR){
  	radius = inR;
  }
  public void display(){
  	System.out.println("I am a circle");
  	System.out.println("my color is " + color);
  	System.out.println("my radius is "+ radius);
  }
	public double computeArea(){
		circleArea = pi * radius * radius;
		return circleArea;
	}
		
	public double computeCircumference(){
		double circumference = 2*pi*radius;
		return circumference;
	}
}