package Hai;

public class Alpha {

	public static void main(String[] args) {
		int row=5; int alpha=65;
		
		for (int i = 0; i <row; i++) {
			for (int j = (row-i); j >=1; j--) {
System.out.print((char)(alpha+i)+" ");
				
			}
			System.out.println(" ");
		}
		
	}

}
