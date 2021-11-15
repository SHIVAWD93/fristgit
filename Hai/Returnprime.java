package Hai;

import java.util.Scanner;

public class Returnprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		System.out.println("create arry");
		int a[] = new int[size];
		a = read(a);
		print(a);
		int[] d = checkprime(a);
		System.out.println("prime numbers are");
		print(d);
		

	}
	public static int[] read(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i+"");
		}
		System.out.println();
	}
	public static int[] checkprime(int a[]) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int k=a[i];
			boolean isprime=true;
			for (int j = 2; j < k; j++) {
				if ( k%j==0) {
					{
						isprime=false;
						break;
						
					}
					
				}
				if (isprime==true) {
					count++;
				}
			}
			int b[]=new int[count];
			int l=0;
			for (int j = 0; j < b.length; j++) {
				int s=a[j];
				boolean isprimew=true;
				for (int m = 2; m < b.length; m++) {
					if(s%m==0)
					{
						isprimew=false;
						break;
						
					}
				}
				if (isprimew==true) 
					{
						b[l]=s;
						l++;
					}
					
			}
				
			return b;	
			

			
	
	
}}}

