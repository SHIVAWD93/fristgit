package Arrays;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int larg=a[0];
		for (int i = 1; i < a.length; i++) {
			if (larg<a[i])
			{
				larg=a[i];
				
			}
		}
		System.out.println("largest number in array"+larg);
	}

}
