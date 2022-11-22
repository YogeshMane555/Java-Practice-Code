package Program;

import java.util.Scanner;

public class GreaterNumberBetweenTwoVariable {

	public static void main(String[] args) {
		
		System.out.println("Enter value for N1 Varible");
		
		System.out.println("Enter value for N2 Variable");
		
		Scanner s=new Scanner(System.in);
		
		int N1=s.nextInt();
		int	N2=s.nextInt();
		
		if(N1<N2)
		{
			System.err.println("N2 is Greater");
		}
		else
		{
			System.out.println("N1 is Greater");
		}
				
	}
	
}
