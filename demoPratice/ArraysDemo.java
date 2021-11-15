package demoPratice;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc ="jspiders";
		int count =0;
	char ch = sc.charAt(8);
		int stlength= sc.length();
		for(int i=0;i<stlength;i++) {
			if(sc.charAt(i)=='s') {
				count++;
				System.out.println(sc.charAt(i));
				
			}
			
		}

	}

}
