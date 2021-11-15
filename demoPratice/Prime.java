package demoPratice;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		int num, count = 0;
		Scanner si = new Scanner(System.in);
		System.out.println("enter a number");
		num = si.nextInt();

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
			if (count == 0) {
				System.out.println("prime " + i);
			} else {

				System.out.println(" notprime " + i);
			}

		}

	}

}
