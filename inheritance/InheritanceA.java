package inheritance;

public class InheritanceA {
//int k;
	public static void main(String[] args) {
		B odj =new B();	
		
	odj.i =1;
	odj.j=2;
	 
	//System.out.println(odj.add(6, 3));
		//System.out.println(obj.add(6, 3));
		//c.mul(4, 5);
		//System.out.println(odj.add(4,5));
	}

}
class  A{
	public int i;
	private int j;
	
	}
}
class B extends A{
void display() {
	super.j = super.i +1;
	
}
	
	
}
