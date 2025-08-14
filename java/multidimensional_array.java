import java.util.Scanner;

public class multidimensional_array {
	
	public static void main(String[] args) {
		
		
		int n;
		int m;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		m=sc.nextInt();
		sc.nextLine();
		
		int arr[][];
		arr=new int[n][m];
			int z;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				z=sc.nextInt();
				sc.nextLine();
				arr[i][j]=z;
			}
		}
		
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
