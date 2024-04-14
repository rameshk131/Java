package general;

public interface Animal {
	
	public abstract void eating(); 
	 public abstract void sleeping(); 
	 default void running() { 
	 System.out.println("Animal is Running"); 
	 } 
	 
	 default void thinking() { 
	 System.out.println("Animal is Thinking"); 
	 } 

}
