package Hai;
import java.util.*;

public class Fib {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter upto series");
		int n=s.nextInt();
		int a=0,b=1,c;
		
System.out.println(a);
System.out.println(b);
for( int i=2;i<=n;i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	
}
	}

}
