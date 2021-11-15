package String;

import java.util.Iterator;
import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="0";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				s1+=ch;
				System.out.println(ch);
			}
			else {
				sum=sum+Integer.parseInt(s1);
				s1="0";
			}
			
			
			
		}
		System.out.println(sum);
		
		
	}

}
