package String;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter A STRING");
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		int index = 0;
		String s3 = "";
		int count=0;
	
		char ch = 0;
		
		for (int i = 0; i < s1.length; i++) {

			if (s1[index].length() < s1[i].length())
			{
				index = i;
				
				
				//System.out.println(s1[index]);
		
		}
		}
		
	
		
		for (int  j = s1[index].length() - 1; j >= 0; j--) 
		{
			ch = s1[index].charAt(j);
			
			s3=s3+ch;
		}
		//
		System.out.println(s1[index]);
		System.out.println(s3);
		
		if(	s1[index].equals(s3))
		{
			System.out.println(" palindrome");
			count++;
			System.out.println(count);
		}
		else {
			System.out.println(" not a palindrome");
		}
	
			
	
	}
		 
		
}
	
