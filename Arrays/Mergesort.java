package Arrays;

import java.util.Scanner;

public class Mergesort {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc1.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println(" for the first array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc1.nextInt();
			
		}
		System.out.println("enter the values for the second array");
		for (int i = 0; i < b.length; i++) {
			b[i]=sc1.nextInt();
			
		}
		int c[] =new int [a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			
		}
		int index=0;
		for (int i = 0; i < a.length; i++) {
			c[i]=b[index];
			index++;
			
		}
		System.out.println(" after merging");
		for(int i :c) {
			System.out.println(i);
		}
		
		
	}

}
