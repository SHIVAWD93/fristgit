package String;

import java.util.Scanner;

public class Removingvowels {
		//removing vowels in the string
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//enter a string
		String a=sc.nextLine();
		String s1="";
		//char ch[]= {'a','e','i','o','u'};
		for (int i = 0; i < a.length(); i++) {
			
			char c=a.charAt(i);
			
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				continue;
				
			} 
			else {
				s1=s1+c;
			}
			
		}
	System.out.println(s1);
		
	}
	}
