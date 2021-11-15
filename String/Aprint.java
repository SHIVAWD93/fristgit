package String;

import java.util.Scanner;

public class Aprint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=0;
		int s1=0;
		int a=0;
		int b=0;
		
		
		n=Integer.parseInt(s);
		while(n>0)
		{
			s1=s1+n%10;
			n=n/10;
		System.out.println(s1);	
		
		}
		if(s1<=26) {
			System.out.println("i");

		if(s1>0&&s1<=26) {
			char k=(char)(s1+64);
			System.out.println(k);
		}
		}
		else 
		{
			while(s1>0) {
				a=a+s1%10;
				s1=s1/10;
				System.out.println(a);
			}
			
			if(a>0&&a<=26) {
				char out=(char)(a+64);
				System.out.println(out);
			}
			
			
		}
		
			
	
		
	}

}
