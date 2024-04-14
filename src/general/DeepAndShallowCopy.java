package general;

class Test{// implements Cloneable{
	
	private int sno;
	private boolean status;	
	private Emp emp;
	
	
	public Test(int sno, boolean status, Emp emp) {
		super();
		this.sno = sno;
		this.status = status;
		this.emp = emp;
	}
	
//	public Object clone() throws CloneNotSupportedException 
//    { 
//        return super.clone(); 
//    }
	
	public void disp() {
		
		System.out.println(this.getSno()+" "+this.isStatus() );
		System.out.println(this.getEmp().getEmpid()+"  "+ this.getEmp().getName());
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}

public class DeepAndShallowCopy{
	
	public static void main(String[] args) throws CloneNotSupportedException { 
	
	Emp e1 = new Emp(100, "Ramesh");	
	Test test1 = new Test(1,false,e1);
	Test test2 = test1;
	 test1.setSno(8);
	 test1.setStatus(true);
	 test1.disp();
	 System.out.println("..............................");
	 test2.disp();
	 
	}
	
	
	
	
}