package programmingBySelf;

public class SwapingAnyRowAndColumnInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
		
		//use matrix.length to determine the number of rows in a 2D array
		System.out.println(matrix.length);		
		//how many columns the first row of the 2D array contains by calling matrix[0].length
		
		
		//Question . Java Program To Interchange any Two Rows and Columns in the given Matrix
		//https://www.geeksforgeeks.org/java-program-to-interchange-any-two-columns-in-the-matrix/
		
		//swaping 1 col(k=1) and 2nd col(l=2)
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<1;j++) {				
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][j+1];
				matrix[i][j+1]=temp;
			}
		}
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<4;j++){    
				System.out.print(matrix[i][j]+" ");    
			}		
		}

	}

}
