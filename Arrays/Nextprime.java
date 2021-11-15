package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Nextprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		int b[]=read(a);
		print(a);
		System.out.println("the sum of array&difference of nextprime"+sumdiff(a));

	}
	public static int [] read(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		return a;
	}
	public static void print(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static int sumdiff(int a[]) {
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		int r=0;
		for (int i = sum+1; i <= i+1; i++) {
			boolean isprime=true;
			for (int j = 2; j <=i; j++) {
				if (i%j==0) {
					isprime=false;
					break;
				}
				
			}
			if(isprime==true) {
				r=i;
				break;
			}
			
		
		}
		return r-sum;
	}

}
