package Arrays;

import java.util.Scanner;

public class Firsthalf {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter a string");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		} int sum=0;
		int pr=1;
		for (int i = 0; i < a.length/2; i++) {
			sum=sum+a[i];
			pr=pr*a[i];
		
			System.out.println(sum);
			System.out.println(pr);
			
		}
		if (sum==pr) {
			System.out.println(" same");
			
		}
		else {
			System.out.println("not a same");
		}
	}

}
