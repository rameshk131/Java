package nov2022;

public class Duplicate {

	public static void main(String[] args) {
		
		//Remove Duplicate element from int array
		//int[] a= {9,5,7,9,3,0,2,6,5,3,9};	
		//Arrays.sort(a);	
		int[] a = {1, 2, 3, 3, 3, 3, 5, 5, 6, 7, 9, 9, 10};
		int len = a.length;
		int[] temp = new int[len];
		int i=0, j=0;
		for(;j<len-1;j++) {
			if(a[j] != a[j+1]) {
				temp[i]=a[j];
				i++;
			}			
		}
		if(j == len-1) {					
			temp[i] = a[j];
		}		
		
		int output[] = new int[i+1];
		
		for(int k=0;k<=i;k++) {
			output[k] = temp[k];
			System.out.println(output[k]);
		}
		
		
		
			
	
	}

}
