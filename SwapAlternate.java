package arrays;

public class SwapAlternate {

	public static int[] SwapAlternatee(int[]arr) {
		for(int i = 0 ; i < arr.length ;i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {9,3,6,12,4,32};
		System.out.println("original array :");
		for(int i = 0 ; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("after swapping the elements:");
		int ans[] = SwapAlternatee(arr);
		for(int i = 0 ;i < arr.length ;i ++) {
			System.out.print(arr[i] + " ");
		}

	}

}
