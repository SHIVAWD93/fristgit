
package Arrays;

import java.util.*;

public class Sortinbuilt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		

	}

}
