package Arrays;

import java.util.Scanner;

public class Reversarray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println(" enetre a string");
int size=sc.nextInt();
int a[]=new int[size];
for (int i = 0; i < a.length; i++) {
	a[i]=sc.nextInt();
}
for (int i =a.length-1; i >=0 ; i--) {
	
		System.out.println(a[i]);
	
}
	}

}
