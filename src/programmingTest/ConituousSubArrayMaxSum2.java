package programmingTest;

public class ConituousSubArrayMaxSum2 {	
	
	    public static void main (String[] args)
	    {
	       //int [] a = {2,1,5,1,3,2,6};
	       int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        int k=3;
	        
	        System.out.println("Maximum contiguous sum is " +
	                                       maxSubArraySum(a,k));
	    }
	 
	    static int maxSubArraySum(int a[], int k)
	    {
	        int l = a.length;	        
	        int max = Integer.MIN_VALUE;
	        int sum=0;int temp = 0;
	        
	        for(int i=0;i<=l-k;i++) {
	        	sum = 0;	        	
	        	for(int j=i;j<i+k;j++) {	        	
	        	 sum = sum+a[j];	
	        	}
	        	if(max < sum)
	        		max= sum;
	        	
	        }
	        
	        return max;
	    }
	        
}
