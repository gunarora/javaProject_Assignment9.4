package javaProject_Assignment9; //Package declaration is mandatory

//Importing packages
import java.util.Set;
import java.util.TreeSet;


public class TreeSetComprator {
	//Main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tree set -- adding values
		Set<Employee> salComp = new TreeSet<Employee>(new SalaryComparison());
        salComp.add(new Employee("Mridul","Sr. Engg",1000));
        salComp.add(new Employee("John","Bussiness Analyst",1000));
        salComp.add(new Employee("Gunjan","Manager",6000));
        salComp.add(new Employee("Gunjan","Lead",4000));
      // loop to printing emp info as per logic
        for(Employee e:salComp){
            System.out.println(e);
        }
	}

}
