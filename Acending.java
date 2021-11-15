package Hai;
import java.util.*;
public class Acending {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
	}

}
