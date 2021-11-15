package Hai;
import java.util.*;
public class Lineak {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		int key=sc.nextInt();
		boolean ser=false;
		int k=0;
		for (int i = 0; i < a.length; i++) {
			if(key==a[i]) {
				ser=true;
				k=i;
				break;
				
			}
			
		}
		if(ser==true) {
			System.out.println("key is found"+ " "+k);
			
		}
		else {
			System.out.println("not found");
		}
		
	}

}
