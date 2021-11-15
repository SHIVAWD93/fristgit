package Hai;

import java.util.Scanner;

public class Palcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		System.out.println("create arry");
		int a[] = new int[size];
		a = read(a);
		print(a);
	int c[]=checkpali(a);
	print(c);
		

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
	public static int[] checkpali(int a[]) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int k=a[i];
			int rem=0;
			int rev=0;
			int temp=a[i];
			while(k>0) {
				rem=k%10;
				
				
				rev=rev*10+rem;
				k=k/10;
			}
			if(temp==rev) {
				count++;
			}
			
			
		}
		int b[]=new int[count];
		int l=0;
		for (int i = 0; i < a.length; i++) {
			int k=a[i];
			int rem=0;
			int rev=0;
			int temp=a[i];
			while(k>0) {
				rem=k%10;
				rev=rev*10+rem;
				k=k/10;
			}
			if(temp==rev) {
				b[l]=k;
				l++;
			}
			
			
		}
		return b;
		
		
	
	}

}