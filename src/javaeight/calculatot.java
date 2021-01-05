package javaeight;

@FunctionalInterface
interface CalculatorDemo
{
	public int caculate(int a,int b);
}

public class calculatot {

	public static void main(String[] args) {
	CalculatorDemo	sum=(a,b)->a+b;
	System.out.println(sum.caculate(10, 10));
	
	CalculatorDemo mul=(a,b)->a*b;
	System.out.println(mul.caculate(10, 10));

	}

}
