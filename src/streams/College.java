package streams;

import java.util.List;

public class College {
	
	private List<Department> departments;

	public College(List<Department> departments) {
		super();
		this.departments = departments;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	

}
