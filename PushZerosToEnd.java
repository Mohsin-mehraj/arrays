package arrays;

public class PushZerosToEnd {

	public static void printarray(int arr[]) {
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void push(int arr[]) {
		int count = 0;
		for( int i =0 ;i < arr.length ;i++){
			if(arr[i]== 0) {
				count ++;
			}
		}
		for(int i = 0; i < arr.length ;i++) {
			if(arr[i]!= 0) {
				System.out.println(arr[i]);
			}
		}
		for(int i = 0; i < count ;i++) {
			System.out.println(0);
		}
			
		
	}
	
	public static void pushZero(int arr[]) {
		
		int k = 0;
		int i = 0;
		while (i < arr.length) {
			if(arr[i]!=0) {
				
				int temp =  arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				
				i++;
				k++;
			}else {
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,0,0,1,3,0,0};
//		push(arr);
		pushZero(arr);
		printarray(arr);
		
	}

}
