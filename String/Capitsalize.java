package String;
import java.util.*;

public class Capitsalize {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		reading a line of string
		String st = s.next();
//		storing data
		String uprCase = "";
//		reading data after conersion
		Scanner strScan = new Scanner(st);
		
		while (strScan.hasNext()) {
			String word = strScan.next();
			uprCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + "  ";

		}
		System.out.println(st);
		System.out.println(uprCase);
	}

}
