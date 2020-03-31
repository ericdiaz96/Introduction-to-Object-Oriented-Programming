//class employee
public class Employee extends Person implements Promotable{
private double annualSalary;
private int hiredYear;
private String ID;

//constructor with parameters employee, salary, date and id
public Employee (String initialName, double initialSalary, int JoinedYear, String id){
//calling the base constructor
super(initialName);
annualSalary = initialSalary;
hiredYear = JoinedYear;
ID = id;
}
//Setting annual salary
public void setAnnualSalary(double newSalary){
annualSalary = newSalary;
}
//Setting hired yr
public void sethiredYear(int year){
hiredYear = year;
}
//Setting Employee ID
public void setID(String newID){
ID = newID;
}
//Returning Annual Salary
public double getAnnualSalary(){
return annualSalary;
}

//returning hired year
public int getHiredYear(){
return hiredYear;
}
//Returning EmployeeID
public String getID(){
return ID;
}
//Promotable Method that doubles the salary
public void promote(){
annualSalary=annualSalary*2;
}

//Return true if both employeees are the same
public boolean equals(Employee otherEmployee){
if (name.equals(otherEmployee.name))
	if (annualSalary ==otherEmployee.annualSalary)
		if(hiredYear == otherEmployee.hiredYear)
			if (ID ==otherEmployee.ID)
				return true;
return false;
}
public void display(){
System.out.println("Employee Name: " + name);
System.out.println("Employee Annual Salary: " + annualSalary);
System.out.println("Employee Hired Year: " + hiredYear);
System.out.println("Employee ID: " + ID);
System.out.println();
}
} //ends the employee class