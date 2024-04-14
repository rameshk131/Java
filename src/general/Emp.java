package general;

import java.util.Objects;

public class Emp {
	
	private int empid;
	private String name;
	
	
	public Emp(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(empid, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empid == other.empid && Objects.equals(name, other.name);
	}
	
	
	
	

}
