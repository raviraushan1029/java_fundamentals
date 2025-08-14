
public class Clone_Array {
	
	
	public static void main(String[] args) {
		
	

	int arr[]={1,2,3,4};
	
	
	int clonearr[] = arr.clone();  // deep copy (creates a new copy, it oppose references )
	
	System.out.println(arr==clonearr); // false (opposed reference) 
	
	for(int x:clonearr){
		
		System.out.print(x+" ");
		
	}
}
	
}
	
	

