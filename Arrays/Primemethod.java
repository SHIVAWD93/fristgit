package Arrays;

import java.util.Scanner;

public class Primemethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
a=read(a);
	print(a);	
	int c[]=checkprime(a);
	print(c);
		
	}
		public static int[] read (int a[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the values");
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			return a;
			
		}
		public static void print(int a[] ) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
		public static int[] checkprime(int a[]) 
		{
			int count =0;
			for (int i = 0; i < a.length; i++) 
			{
				int k=a[i];
				Boolean isprime=true;
				for (int j = 2; j <a.length; j++)
				{
					if (k%j==0) 
					{
						isprime=false;
						break;
						
					}
			
				}
				if(isprime==true) {
					count++;
				}
			}
			
			System.out.println(count);
			int b[]=new int[count];
			int l=0;
			for (int i = 0; i < a.length; i++) {
				int k=a[i];
				Boolean isprime=true;
				for (int j = 2; j <k; j++) 
				{
					if (k%j==0) {
						isprime=false;
						break;
						
					}
					
					if (isprime==true) {
						b[l]=k;
						l++;
						
					}
					
				}
				
			}
			return b;
			
		}
		
	

}
