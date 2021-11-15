

package String;

import java.util.Scanner;

public class Removecharacterspace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		enter a string
		String s=sc.nextLine();
		String s1="";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if (c!= ' ') {
				s1+=c;
				count++;
			}
				
				
			}System.out.println("count of character after removing"+count);
			
			
			
		}

	}


