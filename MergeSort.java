package arrays;

public class MergeSort {

	
	public static int[] MergeSort(int[]arr1 ,int[]arr2) {
		int n =arr1.length;
		int n2 = arr2.length;
		int arr3[] = new int[n+n2];
		int i=0;
		int j = 0;
		int k = 0;
		
		while(i<n && j<n2) {
			
			if(arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k] =arr2[j];
				j++;
				k++;
			}
		}
		while(i <n) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
	
	
	public static void main(String[] args) {
	int arr1 [] = {1, 3, 4, 7, 11};
	int arr2 [] = {2, 5, 6, 13};
	int ans[] = MergeSort(arr1,arr2);
	for(int i = 0 ;i < ans.length;i++) {
		System.out.println(ans[i]);
	}
	}

}
