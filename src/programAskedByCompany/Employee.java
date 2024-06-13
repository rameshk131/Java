package programAskedByCompany;

import java.util.Date;
import java.util.Objects;

public class Employee {

	private int employeeId;
	private String name;	
	private long salary;
	private Date updated_date;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int employeeId, String name, long salary, Date updated_date) {
		super();
		this.employeeId = employeeId;
		this.name = name;		
		this.salary = salary;
		this.updated_date = updated_date;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId;
	}
	
	
	


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", updated_date="
				+ updated_date + "]";
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	
	
	

}
