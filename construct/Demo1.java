package construct;

public class Demo1 {
	public int num1;
	public int num2;
	public int demo(int num1 ,int num2)
	{
	int sum=num1+num2;
	return sum;
	
	}

}
class MainClass {
	public static void main(String[] args) {
		Demo obj=new Demo();
		int k=obj.demo(4,5);
		System.out.println(k);
		
	}
}

