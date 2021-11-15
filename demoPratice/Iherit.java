package demoPratice;

class A {
	 void rest() {
		 
		System.out.println(" krish");
	}
}

class B extends A {
	 void rest2() {
		 int tip = 100;
		System.out.println("krish    2");
	}
}
class C extends A{
	void restaruant() {
		double gst=909.9;
		System.out.println(" krish 333");
	}
	
}
public class Iherit {

	public static void main(String[] args) {

		B obj = new B();
		C obj1=new C();
		obj.rest();
		obj.rest2();
		obj1.restaruant();

	}

}
