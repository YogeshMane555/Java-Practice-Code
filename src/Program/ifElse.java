package Program;

import java.util.Scanner;

public class ifElse {

	public static void main(String args[])
	{
		System.out.println("Enter Number to check whehther it is Odd or Even");
		
		Scanner s=new Scanner(System.in);
		
		int Number=s.nextInt();
				
		if (Number%2==0)
		{
			System.out.println("Entered Number is Even");
		}
		else
		{
			System.out.println("Entered Number is Odd");
		}

	}
	
}
