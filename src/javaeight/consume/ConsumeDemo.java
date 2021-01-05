package javaeight.consume;

import java.util.function.Consumer;

public class ConsumeDemo {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("hello world");

	}

}
