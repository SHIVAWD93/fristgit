package String;

import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sum = " ";

		String s = "m10u20r3a4";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
System.out.println(ch);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				continue;
			} else {
				
				s1 = s1 + ch;
				
//				sum=Integer.parseInt(s1);
				


			}

		}
		System.out.println(s1);
		System.out.println(sum);

	}

}
