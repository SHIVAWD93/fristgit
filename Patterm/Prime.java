package Patterm;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int num=s.nextInt();
		int counter=0;
		if(num==1) {
			System.out.println("prime");
		}
		else {
			
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				counter++;
			}
			
		}
if(counter==2) {
	System.out.println("prime number");
}
else {
	System.out.println("not A prime");
}
	}

}
}
