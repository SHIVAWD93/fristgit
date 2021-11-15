
package String;

import java.util.Scanner;

public class Upconversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); 
		String s1="";
		String s2="";
		
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			
			if(s.indexOf(c)==0 ) {
				s1=s1+c;
				 s2=s1.toUpperCase();
//				System.out.println(s1);
//				System.out.println(s2);
				
			}else {
			
				s2=s2+c;
				
			}
			
		
			
		}
		System.out.println(s2);
		
		}
	
		
	
}
