package String;

import java.util.Iterator;
import java.util.Scanner;



public class Wordreverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2= "";
		String word[] = s.split(" ");
	for (int i = 0; i < word.length; i++) {
		String k=word[i];
			 System.out.println(k);


		
		for (int j =k.length()-1; j>=0; j--)
		{
		
			s2=s2+ k.charAt(j);	

	     }
		
	
	  }
	System.out.println(s2+" " );
		}}

