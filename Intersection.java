package arrays;

public class Intersection {

	
	public static void Intersection(int arr[],int arr1[]) {
		int input[] = new int[4];
		for(int i = 0 ;i < arr.length ;i++) {
			for(int j = 0 ; j <arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					System.out.println(arr[i]);
				
					arr1[j]  = Integer.MIN_VALUE;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,6,3,6,2};
		int  arr1[] = {6,4,5,6,8,4,3};
		 Intersection(arr,arr1);
		
	}

}
