package javaProject_Assignment9; //Package declaration is mandatory

//Importing package
import java.util.Comparator;

//Implementing comprator
public class SalaryComparison implements Comparator<Employee>{
	
	//Method to compare Salary and sort with ascending order if salary equals then comapre with name and if name eqquals compare with designation
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() == o2.getSalary())
		{			
			if(o1.getName().compareTo(o2.getName()) == 0)
			{
				o1.getDesignation().compareTo(o2.getDesignation());
			}
			else
			{
			  return o1.getName().compareTo(o2.getName());
			}
		}
		 if(o1.getSalary() > o2.getSalary()){
	            return 1;
	        } else {
	            return -1;
	        
	}
}
}


 
