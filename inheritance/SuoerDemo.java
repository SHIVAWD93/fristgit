package inheritance;

class F{ int k;
         int g;
	public F(int k,int g) {
	this.k=k;
	this.g=g;
		System.out.println("in f");}
	public F() {System.out.println("in f in int");}
	}
class S extends F { 
	int j;
	public S() {System.out.println("in s");}
	public S(int j,int k,int g) { 
		super(k,g);
		this .j=j;//Here we are explicitly giving parent class constructor with arguments using super keyword
		System.out.println("in s in int");}// In default this child class method has a
	//                                                     default constructor super() which calls parent class
}//                                                         constructor.
public class SuoerDemo {

	public static void main(String[] args) {
		S obj=new S(5,6,7);
		

	}

}
