public class EmployeeTest
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
System.out.println("Employee 1 and 3 are Same: " + a1.equals(a3));
}//ends main method
}// end of TestEmployee Class
