package Arrays;

import java.util.Scanner;

public class Returnpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];	
		a = read(a);
		print(a);
System.out.println(pali(a));		
	}
	public static int[] read(int a[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void print(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static int pali(int a[]) {
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			int k=a[i];
			int rem=0;
			int rev=0;
			int temp=k;
			while (k>0)
			{
				rem=k%10;
				rev=rev*10+rem;
				k=k/10;
				
			}
			if (temp==k) {
				count++;
				
			}
			
		}
		return count;
	}
	
}
