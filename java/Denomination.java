import java.util.*;

public class Denomination{
	
	public static void main(String[] args) {
		
		int amt,q,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		amt=sc.nextInt();
		
		
		q=amt/100;
		ans+=q;
		amt-=q*100;
		
		q=amt/50;
		ans+=q;
		amt-=q*50;
		
		q=amt/20;
		ans+=q;
		amt-=q*20;
		
		ans+=amt;
		
		System.out.println("The minimum number of denomination is"+ans); 
		
		
		
	
		
	
		
		
		
		
	}
}


