package Arrays;

import java.util.Scanner;

public class Addanelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an size");
		int size=sc.nextInt();
		int a[]=new int [size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(" enter a no values to enter");
		int add=sc.nextInt();
		int a2[]=new int[size+add];
		for (int i = 0; i < a.length; i++) {
			a2[i]=a[i];
			
		}
		System.out.println(" enter values");
	int k=1;
		for (int i = a.length; i < a2.length; i++) {
			System.out.println("you are adding" );
		a2[i]=sc.nextInt();
		
			
		}
		System.out.println("after adding elements");
		for(int i:a2) {
			System.out.println(i);
		}
		
		

	}

}
