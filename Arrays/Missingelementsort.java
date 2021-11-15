package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Missingelementsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int [size];
		a=read(a);
		print(a);
		Arrays.sort(a);
		missingele(a);

}
	public static int[] read(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		return a;
	}
	public static void print(int a[]) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		}
	public static void missingele(int a[]) {
		System.out.println("missing element");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j < a[i+1]; j++) {
				System.out.println(j);
				
			}
			
		}
	}
	
	

}
