package String;

import java.util.Scanner;

public class Vowe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		char[] c= {'a','e','i','o','u'};
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println(count);
		
		
				

	}

}
