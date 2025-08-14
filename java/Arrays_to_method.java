
 public class Arrays_to_method {
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4};
		
		hello(arr);
	}
		
		public static void hello(int arr[]){
			int sum=0;
			
			for(int i=0;i<arr.length;i++){
				sum+=arr[i];
			}
			
			System.out.println("the sum is "+sum);
			
		}
		
		
		
	}


