package Arrays;

import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
	int	smal=a[0];
for (int i = 0; i < a.length; i++) {
	if (smal>a[i]) {
		smal=a[i];
		
	}
	
}
System.out.println("smal"+smal);
	}

}
