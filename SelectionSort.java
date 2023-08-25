package arrays;

public class SelectionSort {

	public static void SelectionSort(int arr[]) {
		
		for(int i=0 ; i < arr.length -1 ;i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j = i ; j < arr.length ;j++) {
				if(arr[j]< min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
			
		}
			
		
	
	
	
	public static void main(String[] args) {
		int arr [] = {2, 13, 4, 1, 3, 6 };
		SelectionSort(arr);
		for(int i = 0;i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		int ans [] = SelectionSort(arr);
//		for(int i = 0 ;i < ans.length ;i++) {
//			System.out.println(ans[i]);
//		}
	}

}
