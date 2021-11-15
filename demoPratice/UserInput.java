package demoPratice;

import com.sun.source.util.DocTreeScanner;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();   
	//reads string  
	System.out.println("You have entered: "+str);   
	System.out.println(str.length());
	
		// TODO Auto-generated method stub

	}

}
