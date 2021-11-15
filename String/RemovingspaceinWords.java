package String;

import java.util.Scanner;

public class RemovingspaceinWords {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//enter a string 
		String s=sc.nextLine();
		String arr[]=s.split(s);
		String s1=" ";
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			//if(arr[i]!=" ") {
				s1+=arr[i];
			//}
			
		}
		System.out.println(s1);
		//System.out.println(count);
	}

}
