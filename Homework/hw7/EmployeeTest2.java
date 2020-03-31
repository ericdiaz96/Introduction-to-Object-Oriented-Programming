public class EmployeeTest2
{
public static void main (String [] args)
{
//employee objects
Employee a1 = new Employee("John", 50000, 2004, "A101");
a1.display(); //displaying the details of the employee
Employee a2 = new Employee("George", 90000, 2000, "A201");
a2.display();
Employee a3 = new Employee("Zion", 75000 , 2009, "A301");
a3.display();
System.out.println("John and George are both promotable thus they double their salary.");
a1.promote();
a2.promote();
a1.display(); 
a2.display();
}//ends main method
}// end of TestEmployee Class
