package String;

import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		int count=0;
		String s=sc.nextLine();
		String s1="";
		int k=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1) {
				s1=s1+ch;
			}
			
		}
		System.out.println(s1);

		for (int i= 0; i<s1.length(); i++) {
			{
			for (int  j= 0; j< s.length(); j++)
			{
				if(s1.charAt(i)==s.charAt(j)) {
					k=count++;
			
			}
				
					
			}
			System.out.println(s1.charAt(i)+"   PRESENT  "+k);	
		}
			
		}
	
	}

}
