package Hai;
import java.util.*;
public class Program {
	static void removech(String s,char c) {
		
		int j,cont=0,n=s.length();
		char t[]=s.toCharArray();
		for (int i =j=  0; i < n; i++) {
			if(t[i]!=c) {
				t[j++]=t[i];}
				else 
					cont++;
					
				
			}
		while (cont>0) {
			t[j++]='\0';
			cont--;
			
		}
			System.out.println(t);
		}

	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
//		enter a statement
		String str=s.nextLine();
	String ltr=s.next();
	System.out.println("enter a letter to remove");
		
		char l=ltr.charAt(1);
		String k="Edureka";
		removech(str,l);
	}

}
