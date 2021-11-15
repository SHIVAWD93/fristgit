package String;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);

		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
			}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				
				
			}
		}
		System.out.println("values are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		}
	}



