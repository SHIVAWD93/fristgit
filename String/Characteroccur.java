package String;

import java.util.Scanner;

public class Characteroccur {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//enter a string
	String s=sc.nextLine();
	String s1="";
	int count=0;
	int i=0;
	char c = 0;
	String s2="";
	for ( i = 0; i < s.length(); i++) {
	 c=s.charAt(i);
		if (s1.indexOf(c)==-1) {
			s1=s1+c;
			
		
		}
		
	}System.out.println(s1);
//	System.out.println(s1.length());
//	System.out.println(s.length());
//	
	for ( i= 0; i < s1.length(); i++) {
		
		for (int j = 0; j <s.length(); j++) {
			if(s1.charAt(i)==s.charAt(j)) {
				count ++;
	
			}	
			
		}
		s2=s2+s1.charAt(i)+count;
		
		count=0;
			}
			
			
	System.out.println(s2);
	
	
}
}
