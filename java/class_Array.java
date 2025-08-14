import java.util.Scanner;

class Student{
	int roll;
	String name;
	
	Student(int roll,String name){
		
		this.roll=roll;
		this.name=name;
	}
	
	
}


public class class_Array {

	public static void main(String[] args) {
		
	
	Student[] arr;
	
	
	
	
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	
	arr=new Student[n];
	
	for (int i=0;i<n;i++){
		int roll = 0;
		String name=null;
		
		roll=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		arr[i]=new Student(roll,name);
	}
	
	
	
	for(Student x:arr){
		
		System.out.println("the roll no. of student "+ x.roll);
		System.out.println("The name of the student is "+ x.name);
	
		
	
	}
	
	
		

		
	}
	
	
}
