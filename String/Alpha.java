package String;
import java.util.Iterator;

public class Alpha {
	public static void main(String[] args) {
		int alpha=65;
		int row =5;
		for (int i = row; i >=0; i--) {
			for (int j = 2*(row-i); j >=0; j--) {
				System.out.print(" ");
				
			}
			for (int j=0;j<=i;j++) {
				System.out.print("@"+"   ");
			}
			System.out.println("   ");
		}
	}

}
