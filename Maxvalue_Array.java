package Programming_Questions;

public class Maxvalue_Array {
public static void main(String[] args) {
	int[] arr = {3,4,6,2,7,5,4,15,7,8};
	int max = Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]> max) {
		max= arr[i];
		}
		
	}
	System.out.println(max);
}
}
