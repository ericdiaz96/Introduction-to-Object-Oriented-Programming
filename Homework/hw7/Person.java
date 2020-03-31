public class Person
{
protected String name;
public Person()
{
name = "No name yet";
	}
public Person(String initialName)
{
name = initialName;
}
//set new name
public void setName(String newName)
{
name = newName;}
//accessor for name
public String getName()
{
return name;
}
//method that writes person's name
public void writeOutput()
{
System.out.println("Name: " + name);
}
//returns true if names are same otherwise returns false
public boolean hasSameName(Person otherPerson)
{
return this.name.equalsIgnoreCase(otherPerson.name);
}
}// end of Person Class
