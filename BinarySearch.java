package arrays;

public class BinarySearch {

	public static int BinarySearch(int arr[], int n) {
		int s = 0;
		int e = arr.length-1;
		
		while(s <= e) {
			int mid = (s+e)/2;
			if(n == arr[mid]) {
				return mid;
			}else if(n < arr[mid]) {
				e = mid -1;
			}else {
				if(n > arr[mid] ) {
					s = mid +1;
				}
			}
				
			
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 7, 9, 11, 12, 45};
		int n = 45;
		
		int ans = BinarySearch(arr,n);
		System.out.println(ans);

	}

}
