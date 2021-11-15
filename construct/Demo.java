package construct;


public class Demo { 
	int num1;
	int num2;
	public int demo(int num1 ,int num2)
	{
	int sum=num1+num2;
	return sum;
	
	}

}
class A {
	public static void main(String[] args) {
		Demo obj=new Demo();
		System.out.println(obj.demo(4, 5));
		
	}
}
