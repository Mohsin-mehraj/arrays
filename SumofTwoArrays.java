package arrays;

public class SumofTwoArrays {

	
	public static void printarray(int output[]) {
		for(int i = 0; i<output.length;i++) {
			System.out.println(output[i]);
		}
	}
	
	public static void SumofTwo(int arr1[],int arr2[],int output[]) {
		int i = arr1.length -1;
		int j = arr2 .length -1;
		int carry = 0;
		int k = output.length -1 ;
		
		while(i >= 0 && j >= 0) {
			int num = arr1[i] +arr2[j] + carry;
			output[k] = num % 10;
			carry = num/10;
			i--;
			j--;
			k--;
		}
		 if(carry>0){
		        output[k]=carry;
		        k--;
		        }
		
		while(i>=0) {
			int num = arr1[i]  + carry;
			output[k] = num % 10;
			carry = num/10;
			i--;
			k--;
		}
		
		while(j>=0) {
			int num = arr2[j]  + carry;
			output[k] = num % 10;
			carry = num/10;
			j--;
			k--;
		}
//		output[0] = carry;
		
	}
	
	
	
	public static void main(String[] args) {
		int arr1[]= {9,7,6,1};
		int arr2[] = {4,5,9,6,7};
		int max = Math.max(arr1.length, arr2.length);
		int  output[] = new int [max+1];
		SumofTwo(arr1,arr2,output);
		printarray(output);
	}

}
