package Hai;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int k[]=new int [size];		
		for (int i = 0; i < k.length; i++) {
			k[i]=s.nextInt();
			
		}
		int count=0;
		for (int i =0; i < k.length; i++) {
			if(1==k[i])
				count++;
			System.out.println(k[i]);
			System.out.println(count);
		} 
		
	}

}
