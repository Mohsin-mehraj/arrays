package arrays;

public class SecondLargest {

//	public static int SecondLargest(int arr[]) {
//		int largest = Integer.MIN_VALUE;
//		int secondLargest = Integer.MIN_VALUE;
//		for(int i = 0 ; i < arr.length ;i++) {
//			if(arr[i] > largest) {
//				largest = arr[i];
//			}
//			
//		}
//			for(int j = 0 ; j < arr.length ;j++) {
//		if(arr[j]>secondLargest && arr[j] < largest && arr[j]!= largest) {
//					secondLargest = arr[j];
//				}
//			}
//		
//		return secondLargest;
//		}
//		
		
	
	
	public static int SecondLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for( int i = 0 ; i < arr.length ;i++) {
			if(arr[i] > largest) {
				second = largest;
				largest = arr[i];
			}else if(arr[i]<largest) {
				if(arr[i]>second && arr[i]!= largest) {
					second = arr[i];
				}
			}
		}
		return second;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,10,9,10,44};
		int ans = SecondLargest(arr);
		System.out.println(ans);
	}

}
