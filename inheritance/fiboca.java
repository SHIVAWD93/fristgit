package inheritance;


public class fiboca {

	public static void main(String[] args) {
		int N =0;
		while( N <100) {
			int n1=0;
			int n2=1;
			N =n1 + n2;
			System.out.print(N);
			n1= n2;
			n2=N;
			N=N+1;
			
			
		}

	}

}
