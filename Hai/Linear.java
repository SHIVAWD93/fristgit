package Hai;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int key=s.nextInt();
		boolean sear=false;
//		creating an array
		int a[]=new int [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
					}
		for (int i = 0; i < a.length; i++) {
			if(key==a[i]) {
				sear=true;
				break;
			}
			
		}
		if(sear==true) {
			System.out.println("key is found");
		}
		else {
			
			System.out.println("not found");
		}
	}

}
