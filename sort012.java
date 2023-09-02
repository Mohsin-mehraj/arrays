package arrays;

public class sort012 {

	public static void printarray(int arr[]) {
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int arr[]) {
		int nz = 0;
		int nt = arr .length-1;
		
		int i = 0;
		while( i <= nt) {
			if (arr[i]==0) {
				int temp = arr[nz];
				arr[nz] =  arr[i];
				arr[i] = temp;
				i++;
				nz++;
			}else if (arr[i] == 2) {
				int temp = arr[nt];
				arr[nt] = arr[i];
				arr[i] = temp;
				nt--;
				
				if(arr[i] == 0) {
					int temp2= arr[i];
					arr[i] = arr[nz];
					arr[nz] = temp2;
					i++;
					nz++; 
				}
				
			}else {
				i++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,0,2,1,0,1,2,0};
		sort(arr);
		printarray(arr);

}

}

//int n = nums.length;
//	for(int i = 0 ; i < n-1 ;i++) {
//		for(int j = 0 ; j < n -1-i ;j++) {
//			if(nums[j]>nums[j+1]) {
//				int temp = nums[j];
//				nums[j] = nums[j+1];
//				nums[j+1] = temp;
//			}
//		}
//less optimial solution
//
