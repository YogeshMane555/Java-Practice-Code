package Program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter String Value :");
		
		Scanner s=new Scanner(System.in);
		
	    String Name= s.nextLine();
		
	    String UpperCase=Name.toUpperCase();
	    
	    String LowerCase=Name.toLowerCase();
	    
	    int lengthhOfText=Name.length();
	    
	    System.out.println("Entered Text is :" +Name);
	    
	    System.out.println("Entered Text Lenght is :" +lengthhOfText);
	    
	    System.out.println(UpperCase);
	    
	    System.out.println(LowerCase);
	    
	    StringBuilder st=new StringBuilder();
	    
	    st.append(Name);
	    
	    st=st.reverse();
	    
	    System.out.println("In Reverse Order :" +st);
	}
	
}
