package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import general.Employee;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		double res = list.stream().mapToInt(n->n).average().getAsDouble();
		//System.out.println(res);
		
		int salaryLimit = 25;

	    List<Employee> employees = new ArrayList<>(){{
	        add(new Employee(10));
	        add(new Employee(20));
	        add(new Employee(30));
	        add(new Employee(40));
	        add(new Employee(60));
	    }};
	    
	    Double avg = employees.stream().filter( e-> e.getSalary() >= salaryLimit).collect(Collectors.averagingInt(e->e.getSalary()));	    
	    System.out.println(avg);

	}

}
