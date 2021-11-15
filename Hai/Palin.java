package Hai;

public class Palin {

	public static void main(String[] args) {
		int num = 121;
		int rem=0;
int temp=num;
		int pal = 0;
		while (num > 0) {

			 rem = num % 10;
			pal = pal * 10 + rem;
			num = num / 10;

		}
		if (temp == pal) {
			
			System.out.println("number is palindrome");

		}
		else {
			System.out.println(" not a palindrome");
		}

	}

}
