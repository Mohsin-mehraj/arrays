package arrays;

public class Checkrotation {

	
	public static int check(int arr[]) {
		
		int ans = 0 ;
		for (int i = 0 ; i < arr.length-1 ; i++){
			if(arr[i+1] < arr[i]) {
				ans = i+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr [] = {5,6,1,2,3,4};
		int ans = check(arr);
		System.out.println(ans);
	}

}
