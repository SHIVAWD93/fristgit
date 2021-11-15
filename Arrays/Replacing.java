package Arrays;

import java.util.Scanner;

public class Replacing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter size  of the");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter no of to replace");
		int repla=sc.nextInt();
		while (repla>0) {
		System.out.println("enter the index");
			int index=sc.nextInt();
		System.out.println(" enter the values ");
		int val=sc.nextInt();
		a[index]=val;
		System.out.println("you are naving"+repla+"chances");
			
		}
		for(int i :a) {
		System.out.println(i);	
		}
		
	}

}
