package Hai;
import java.util.*;

public class Bu {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
//		int key=sc.nextInt();
//		boolean sear=false;
//		int index=0;
		
		int a[]=new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (key==a[i]) {
				sear=true;
				index=i;
				break;
				
				
			}
		}
		if (sear==true) {
			System.out.println("found"+index);
			
		} else {
			System.out.println("not found");

		}

	}

}
