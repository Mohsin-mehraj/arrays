package arrays;

public class returnpair {

	public static void printpair(int[]arr) {
		int n =arr.length;
		
		for(int i = 0 ; i < n-1 ;i++) {
			for(int j = i+1 ; j< n ;j++) {
				System.out.println("(" + arr[i] +","+ arr[j] + ")");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int []arr = {1,4,7,5,6};
		printpair(arr);

	}

}
