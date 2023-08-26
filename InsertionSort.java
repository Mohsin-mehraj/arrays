package arrays;

public class InsertionSort {

	
	public static void PrintArray(int arr[]) {
		for (int i = 0 ;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void InsertionSort(int[]arr) {
		int n = arr.length;
		
		for(int i = 1 ;i<n ; i++) {
			
			int j= i-1;
			int temp = arr[i];
			 while (j >= 0 && arr[j] > temp) {
				 arr[j+1] = arr[j];
				 j--;
			 }
			 arr[j+1] =  temp;
			
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 13, 4, 1, 3, 6 };
		InsertionSort(arr);
		PrintArray(arr);
		
		

	}

}
