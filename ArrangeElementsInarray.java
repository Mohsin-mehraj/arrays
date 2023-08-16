package arrays;

public class ArrangeElementsInarray {

	public static int[] arrange(int n) {
		int arr[] = new int[n];
		int input = 1;
		int size = (n-1)/2;
		
		for(int i = 0 ; i <= size ;i++) {
			arr[i] = input;
			input = input + 2;
		}
		int input2 = 1;
		for(int i = n-1 ; i >= (n-1)/2+1; i--) {
			arr[i] = input2+ 1;
			input2= input2+ 2;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int ans [] = arrange(9);
		for(int i = 0 ;i < ans.length ;i++) {
			System.out.println(ans[i]);
		}

	}

}
