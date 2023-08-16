package arrays;

public class ArrangeElements2pointer {

	
	public static int[] Tpoin(int n) {
		int arr[] = new int[n];
		  int start=0;

	        int end=n-1;

	        int ans=1;

	 

	        while(start<end){

	            arr[start]=ans;

	            ans++;

	            arr[end]=ans;

	            ans++;

	            start++;

	            end--;

	        }

	        if(start==end) {

	            arr[start]=ans;

	        }
	
		return arr;
	}
	
	public static void main(String[] args) {
		int ans [] = Tpoin(9);
		for(int i = 0 ;i < ans.length ;i++) {
			System.out.println(ans[i]);
		}
	
	}

}
