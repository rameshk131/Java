package com.java.program;

class BinarySearch{
  
	//arr[] is sorted
    int binarySearch(int arr[], int key)
    {
    	int l=0;
    	int m=0;
    	int r= arr.length-1;
    	
    	while(l <= r){
    		System.out.println("while");
    		m = (l+r)/2;
    		if(key < arr[m] ){
    			r = m-1;
    		}else if(key > arr[m]){
    			l= m+1;
    		}else{
    			return m;
    		}
    		
    	}
    	
    	return -1;
    } 
   
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        // 1st sort if not sorted
        int arr[] = {2, 3, 4, 10, 40,67};       
        int key = 10;
        int result = ob.binarySearch(arr, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + 
                                   "index " + result);
    }
}
