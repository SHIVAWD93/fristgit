package String;

import java.util.Scanner;

public class RepeatativeValues {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string..");
		String s1=scanner.next();
		String s2="";
		s2=s1.replace("p", "e");
		System.out.println(s2);
	}

}
