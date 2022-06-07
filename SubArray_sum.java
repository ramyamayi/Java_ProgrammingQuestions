package Programming_Questions;

import java.util.Arrays;

public class SubArray_sum {

	public static void main(String[] args) {
		
		        int arr[] = { 10, 2, 2, 20, 10 };
		        int k = 30;
		        int n = arr.length;
		     
		 
		     
		        for (int i = 0; i < n; i++) {
		            int sum = 0;
		            for (int j = i; j < n; j++) {
		               
		                sum += arr[j];
		               
		                if (sum == k) {
		                	System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
		            }
		        }
		      
		        }}
}
		
	


