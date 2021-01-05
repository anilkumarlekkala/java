package javaeight.function;

public class BiFunction {

	public static void main(String[] args) {
		java.util.function.BiFunction<Integer, Integer, Integer> c=(a,b)->a+b;
		System.out.println(c.apply(10, 20));

	}

}
