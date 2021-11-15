package demoPratice;
import java.util.Scanner;
public class MethodArray {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array");
       int size = sc.nextInt();
       int [] a= new int[size];
        a=read(a);
        palin(a);
        print(a);}
	public static int[] read(int a[]) {
		System.out.println("enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{Scanner sc = new Scanner(System.in);
		a[i]=sc.nextInt();
		} return a;}
	public static int print(int a[]){
		for(int j: a) {System.out.println(j);}return a;}
	public static void  palin(int b[])
	{  int sum=0;int count=0; int i=0;int n=b[i];
	   for( i=0;i<b.length;i++) {
		
      while(b[i]>0) {
			int rem =b[i]%10;
			sum= sum*10+rem;
		    b[i]= b[i]/10;}
			 if (n==sum)
			 {  
			  System.out.println("palindrome   : "+b[i]);
			    count++;
			    System.out.println(count+"are the no of palindromes are present");
			    }
			 else {
				 System.out.println("no p[alin");
			 }
			 }
		System.out.println();
		}
	}