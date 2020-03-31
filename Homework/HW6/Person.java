import java.util.Scanner;
public class Person
{
	private String name;
	private int age;
	//default constructor
	public Person()
	{
		name = "No name yet";
		age = 0;
	}//end of default constructor
	//second constructor
	public Person(String newName, int newAge)
	{
	name = newName;
	age = newAge;
	} // End of second constructor
	//setName to initialize the name
	public void setName (String newName)
	{
		name = newName;
	}
	//createAdult method
	public static Person createAdult()
	{
		return new Person ("An adult", 21);
	}// end of createAdult method
	// setAge() to initialize the age with the newAge
	public void setAge (int newAge)
	{
		if (newAge >=0)
			age = newAge;
		else{
			System.out.println("ERROR: Age is " + "negative.");
			System.exit(0);
		}
	}
	//setPerson sets the name and age
	public void setPerson (String newName, int newAge)
	{
		setName(newName);
		setAge(newAge);
	}
	//getName() returns the name of the person
	public String getName()
	{
	return name;
	}
	//getAge
	public int getAge()
	{
	return age;
	}
}
