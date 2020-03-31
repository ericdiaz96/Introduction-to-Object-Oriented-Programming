import java.util.Scanner;
public class Circle{
  private String color;
  private double radius;
  public Circle(int r, String c) // default constructor
  {
  	radius = r;
  	color = c;
  }
	public void doubleRadius()
	{
	radius *= 2; //Method doubles radius.
	}
	
	boolean equals (Circle circle)
	{
		if (radius ==circle.radius && color ==circle.color)
		return true; 
		return false;
	}
  public void display(){
  	System.out.println("I am a circle");
  	System.out.println("my color is " + color);
  	System.out.println("my radius is "+ radius + "\n");
  }
}