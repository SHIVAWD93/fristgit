package String;

public class Reveralpha {
	public static void main(String[] args) {
		int row=5;int count=0;int inde=0;
		for (int i = row; i >=1; i--) {
			for (int j = (row-i); j>=1; j--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j < i; j++) {
				for(int k=2;k<j;k++) {
					if(j%k==0) {
					count++;
					inde=j;
					break;
					
					}
				if(count==2) {
					
					System.out.print(inde+j);
				}
				}
				
				
			}
			System.out.println();
		}
	}

}
