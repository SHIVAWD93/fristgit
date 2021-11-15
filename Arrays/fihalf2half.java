package Arrays;

import java.util.Scanner;

public class fihalf2half
{

	public static void main(String[] args)
	{
		
Scanner sc=new Scanner(System.in);
System.out.println("enter a size");
int size=sc.nextInt();
int a[]=new int[size];
int sum=0;
int product=1;
for (int i = 0; i < a.length; i++)
{
	a[i]=sc.nextInt();
	
}
for (int i = 0; i < a.length/2; i++)
{
sum=sum+a[i];
product=product*a[i];

}
System.out.println(sum);
System.out.println(product);
if(sum==product) {
	System.out.println("same");
}
else {
	System.out.println(" not same");
}



}

}
