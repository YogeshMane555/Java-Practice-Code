package Program;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter Number to check whether it is Odd or Even");
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered Number is Even");
		}
		else {
			System.out.println("Entered Number is Odd");
		}
		
	}
}
