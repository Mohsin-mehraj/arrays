package arrays;

public class Sort01 {

	
	public static void Sort(int[] arr) {
		  int i =0; 
	        int j = arr.length-1 ;
	        
	        
	        while(i < j)
	        {
	            if(arr[i] == 0 && arr[j] == 1)
	            {
	                i++ ; 
	                j-- ; 
	                System.out.println(arr[i]);
	               
	                continue  ;
	            }
	            
	            else{
	                
	            if(arr[i] == 0 && arr[j] == 0)
	            {
	                i++ ; 
	                continue  ;
	            }
	           else if(arr[i] == 1 && arr[j] == 1)
	            {
	                j-- ;
	                continue  ;
	            }
	                
	                
	          else if(arr[i] == 0 && arr[j] == 1)
	            {
	                i++ ;
	                j-- ; 
	                System.out.println(arr[i]);
	                
	                continue  ;
	                
	            }
	                
	                
	            else{
	                
	                int temp =arr[i] ;
	                arr[i] = arr[j] ;
	                arr[j] = temp ;
	                System.out.println(arr[i]);
	                
	                i++ ; j-- ;
	              
	                
	                
	            }    
	                
	            }
	           
	            
	        }
		
			
			
			
		}
		
		
	
	
	public static void main(String[] args) {
		int arr[] =  {0 ,1, 1, 0, 1, 0, 1};
		Sort(arr);
		
	}

	

}
