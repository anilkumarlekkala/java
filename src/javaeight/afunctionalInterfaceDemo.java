package javaeight;

@FunctionalInterface
interface Hello
{
	public void hello();
}
public class afunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Hello hello=()->System.out.println("hello");
		hello.hello();

	}

}
