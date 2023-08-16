package arrays;

import java.util.Scanner;

public class ReturnArraySum {

	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i = 0 ;i < size ;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int sum(int[]arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static int linear(int arr[] ,int n) {
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] == n) {
				return i;
			}	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		
		int ans = linear(arr,5);
		System.out.println(ans);
	}

}
