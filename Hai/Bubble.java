package Hai;
import java.util.*;
public class Bubble {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int n[]=new int[size];
	for (int i = 0; i < n.length; i++) {
		n[i]=sc.nextInt();
		
	}
	for (int i = 0; i < n.length-1; i++) {
		for (int j = 0; j < n.length-i-1; j++) {
			
			if(n[j]>n[j+1]) {
				int temp=n[j];
				n[j]=n[j+1];
				n[j+1]=temp;
				
			
			}
			
			
		}
		for(int i1=0;i1<n.length;i1++) {
		
		System.out.println(n[i1]);
	}
	

	  
}
}}
