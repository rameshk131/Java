package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyEmpDeptDemo {

	public static void main(String[] args) {
		
		int salaryLimit = 25;
		
		List<Employee> ph_emps = new ArrayList<>(){{
	        add(new Employee(10));
	        add(new Employee(20));	        
	        add(new Employee(30));	        
	    }};
	    
	    List<Employee> ch_emps = new ArrayList<>(){{	        
	        add(new Employee(70));
	        add(new Employee(80));
	        add(new Employee(90));
	    }};
	    List<Employee> math_emps = new ArrayList<>(){{	            
	        add(new Employee(30));
	        add(new Employee(40));
	        add(new Employee(50));
	        
	    }};
	    
	    
	    Department ph_dpt = new Department(ph_emps);
	    Department ch_dpt = new Department(ch_emps);
	    Department math_dpt = new Department(math_emps);
	    
	    List<Department> departments = new ArrayList<>();
	    departments.add(ph_dpt);
	    departments.add(ch_dpt);
	    departments.add(math_dpt);
	    
	    
	    College company = new College(departments);
	    
	   //1 find the avg salary of emp whose salary is greater than salaryLimit	    
	    //double avg = company.getDepartments().stream().map(dep -> dep.getEmployees().stream().map(e->e.getSalary()).filter(sal->sal >salaryLimit).mapToInt(e->e).average().getAsDouble());
	    
	    List<Department> dl = company.getDepartments();	    
	    long count = company.getDepartments().stream().flatMap(d->d.getEmployees().stream()).filter(e-> e.getSalary() > salaryLimit).mapToInt(e->e.getSalary()).count();
	    double avg = company.getDepartments().stream().flatMap(d->d.getEmployees().stream()).filter(e-> e.getSalary() > salaryLimit).mapToInt(e->e.getSalary()).average().getAsDouble();
	    System.out.println("count = "+count);
	    System.out.println("avg = "+avg);
	   
	 
	  
	}

}
