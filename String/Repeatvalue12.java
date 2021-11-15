package String;

import java.util.Scanner;

public class Repeatvalue12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// enter the string
		String s = sc.nextLine();
		String s1 = "";
		int count = 0;
		int i = 0;
		String z = "";
		char t = 0;
		int k1 = 0;

		int j = 0;
		for (i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if (s1.indexOf(c) == -1)
			{
				s1 = s1 + c;

			}

		}
		System.out.println(s1);
		for (i = 0; i < s1.length(); i++) {

			for (j = 0; j < s.length(); j++) 
			{
				if (s1.charAt(i) == s.charAt(j)) 
				{
					count++;

				}
			}
			System.out.println(s1.charAt(i) + "" + count);

			if (count > 1) 
			{

				for (k1 = 1; k1 <= count; k1++)
				{
					System.out.println(k1);
					t = (char) (k1);
					System.out.println(t);

				}
				z += s.replace(s1.charAt(i), t);
			}
			count = 0;
		}
		System.out.println(z);

	}
}
