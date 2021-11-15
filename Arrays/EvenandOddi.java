package Arrays;

import java.util.Scanner;

public class EvenandOddi {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter a number");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				System.out.println(a[i]);
			} else {
//System.out.println(a[i]);
			}
			
		}
	}

}
