package arrays;

public class FindUnique {

	public static int FindUnique(int[]arr) {
		int ans = 0;
		for(int i = 0 ; i < arr.length ;i++) {
		
			ans = ans^ arr[i];
			System.out.println(ans);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2,3,1,6,3,6,2};
		int ans = FindUnique(arr);
		System.out.println(ans);
	}

}
