import java.util.Scanner;
public class Person6
{
	public static void main (String args[])
	{
		Students s=new Students();
		Students.createToddler();
		Students.createPreschooler();
		Students.createAdolescent();
	}
}
class Students
{
	String firstName, lastName;
	int age;
	
	Students()
	{
		firstName= " ";
		lastName = " ";
		age = 00;
	}
	public void setName (String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName = lastName;
	}
	
	public String getName()
	{
		return firstName+lastName;
	}
	public void setAge (int age)
	{
		this.age=age;	
	}
	public int getAge()
	{
		return age;
	}
	public static void createToddler()
	{
		Students s = new Students();
		s.setName("A", "Toddler");
		s.setAge(2);
		String name=s.getName();
		int a = s.getAge();
		System.out.println(" "+ name + " "+ a);
	}
	public static void createPreschooler()
	{
		Students s = new Students();
		s.setName("A", "Preschooler");
		s.setAge(5);
		String name=s.getName();
		int a = s.getAge();
		System.out.println(" "+ name + " "+ a);
	}
	public static void createAdolescent()
	{
		Students s = new Students();
		s.setName("An", "Adolescent");
		s.setAge(9);
		String name=s.getName();
		int a = s.getAge();
		System.out.println(" "+ name + " "+ a);
	}
}