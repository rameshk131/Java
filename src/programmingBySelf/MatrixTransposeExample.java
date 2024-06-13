package programmingBySelf;

public class MatrixTransposeExample {

	public static void main(String[] args) {
		// Converting rows of a matrix into columns and columns of a matrix into row is called transpose of a matrix.
		
		//creating a matrix  
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};
		
		//creating another matrix to store transpose of a matrix  
		int transpose[][]=new int[original.length][original[0].length];  //3 rows and 3 columns 
		
		for(int i=0;i<original.length;i++) {
			for(int j=0;j<original[0].length;j++) {				
				transpose[j][i]=original[i][j];				
			}
		}
		
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(original[i][j]+" ");    
			}		
		}
		
		System.out.println("   ");  
		
		System.out.println("Printing Matrix After transpose:");  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(original[i][j]+" ");    
			}		
		}

	}

}
