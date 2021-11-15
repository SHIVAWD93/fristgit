package Hai;

import java.util.Iterator;
import java.util.Scanner;

public class End {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
        int size=sc.nextInt();
        int a[]=new int [size];
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
        int count=0;
        for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				a[count++]=a[i];
						System.out.println(" the array has"+a[i]);
				
				
			}
			for (int j = count;j<a.length; j++) {
				a[i]=0;
				
			}
			for (int j = 0; j < a.length; j++) {
				
			}System.out.println(a[i]);
			
		}
        }

}
