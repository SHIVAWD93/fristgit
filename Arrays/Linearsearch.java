package Arrays;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter a size");
	int size=sc.nextInt();
	int a[]=new int [size];
	Boolean search= false;
	
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
		
	}
	int key=sc.nextInt();
	int k=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(key==a[i]) {
			search=true;
			k=a[i];
			break;
		}
		
	}
	if(search==true) {
		System.out.println(" element found"+k);
	}
	else {
		System.out.println("element not found");
	}
	}

}
