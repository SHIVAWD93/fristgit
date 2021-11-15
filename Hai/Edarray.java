package Hai;
import java.util.*;
public class Edarray {
	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
		String s=" hai murali krishna";
		String a[]=s.split(" ");
		for(String t:a) 
		{
			System.out.println(t);
			
		}
		for (int i=0;i<3;i++) {
			char s1[]=a[i].toCharArray();
			for (int j =  s1.length-1; j >=0; j--) {
				System.out.println(s1[j]);
			}
		}
	}
	
	

}
//reverse