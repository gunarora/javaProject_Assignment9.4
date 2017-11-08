package javaProject_Assignment9; //Package declaration is mandatory

/*Create a class called Employee with attributes: name, designation,
and salary. Insert employee objects into the TreeSet where default
natural sorting order is ascending order of salaries. If two
employees have the same salary then consider alphabetical orders
of their names, and Write a comparator class to define customized
sorting which is the alphabetical order of employee names. If two
employees have the same name then consider designation for
comparison.*/

public class Employee {
//declaring private variables
private String name;
private String designation;
private int salary;

//properties 	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

//parameterized constructor
public Employee(String name, String designation, int salary)
{
this.name = name;
this.designation = designation;
this.salary = salary;
}

	//method
public String toString() {
    return name + " : " + designation + " : " + salary;
 }

}




