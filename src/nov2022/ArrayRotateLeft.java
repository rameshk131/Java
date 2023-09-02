package nov2022;

public class ArrayRotateLeft {
	
	
	static void rotate_left(int[] arr, int no_of_rotation) {
		
		for(int i=0; i< no_of_rotation;i++) {
			int temp =0;
			int j=0;
			temp = arr[j];
			for(;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		
		for(int k:arr) {
			System.out.println(k);
		}
		
		
	}

	public static void main(String[] args) {
		
		int my_arr[] = { 45, 67, 89, 91, 23, 0, 11 };
		rotate_left(my_arr,2);
		
		
	}
	
	

}
