package general;

import java.io.Serializable;

public class MySingleton implements Cloneable, Serializable{
	
	private static final long serialVersionUID = 1L;
	private static MySingleton instance = null;	
	private MySingleton() {	
		
		// Prevent form Reflection
		if(instance != null) {
			throw new IllegalStateException("Object can't be created through reflection");
		}
		
	}	
	public static synchronized MySingleton getInstance() {
		
		if(instance == null) {
			instance = new MySingleton();
		}		
		return instance;		
	}
/*	
	// Prevent form Cloneable
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	// Prevent form Serializable
	Object readResolve(){		
		return instance;
		
	}
 */	
	
}
