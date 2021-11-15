package Arrays;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		int c[]=new int[size];
		for (int i = 0; i < c.length; i++) {
			c[i]=sc.nextInt();
			}
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-i-1; j++) {
				if(c[j]>c[j+1])
				{
					int temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
				
			}
			
		}
		for(int i:c) {
			System.out.println(i);
		}
		
		

	}

}
