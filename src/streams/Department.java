package streams;

import java.util.List;

public class Department { 
	
	private List<Employee> employees;

	public Department(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
		

}
