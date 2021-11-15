package Arrays;

import java.util.Scanner;

public class Evenin {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=sc.nextInt();
		
	}
	for (int i = a.length/2; i < a.length; i++)
	{
	
		System.out.println(a[i]);
	}
	
	}

}
