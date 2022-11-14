package Program;

import java.util.Scanner;

public class swapping_two_variable {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter value of A");
		int A=s.nextInt();
		
		System.out.println("Enter value of B");
		int B=s.nextInt(); 	
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("Value of A is :" + A);
		
		System.out.println("Value of B is :" + B);
		
	}
	
}
