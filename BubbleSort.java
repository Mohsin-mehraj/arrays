package arrays;

public class BubbleSort {

	public static int[] BubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i < n-1 ;i++) {
			for(int j = 0 ; j < n -1-i ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		int arr [] = {2, 13, 4, 1, 3, 6, 28 };
		int ans[] =	BubbleSort(arr);
		for(int i = 0 ;i < ans.length ;i++) {
			System.out.println(ans[i]);
		}

	}

}
