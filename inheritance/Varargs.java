package inheritance;

public class Varargs {

	public static void main(String[] args) {
		
		int add(int ...n) {
			int sum =0 ;{
			for(int i : n) {
				sum = sum+i;
		}
return sum;
	
			}
}
		Varargs obj = new Varargs();
		System.out.println(obj.add(4));
}
	}