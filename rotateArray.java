package arrays;

public class rotateArray {

	public static void printarray(int [] arr) {
		for(int i = 0 ;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void reverse(int arr[], int i, int j) {
		
		
		while(i < j) {
			int temp  = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void rotateArray(int []arr , int d) {
		
	        // Reverse entire array
	        reverse(arr, 0, arr.length - 1);
	        // Reverse first k elements
	        reverse(arr, 0, arr.length-1 -d);
	        // Reverse remaining elements
	        reverse(arr,  arr.length -d, arr.length-1);
		
	}
	
	public static void main(String[] args) {
		int arr[] =  {1,2,3,4,5,6,7};
		int d = 3;
		rotateArray(arr,d);
		printarray(arr);

	}

}
