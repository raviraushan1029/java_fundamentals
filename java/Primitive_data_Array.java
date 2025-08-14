import java.util.Scanner;

public class Primitive_data_Array {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int z=sc.nextInt();
		
		int arr[]= new int[z];
		
	for(int x=0; x<arr.length;x++){
		arr[x]=sc.nextInt();
	}
		
		for(int x:arr){
			System.out.println(x);
		}
		
		
		
	}
	
}
