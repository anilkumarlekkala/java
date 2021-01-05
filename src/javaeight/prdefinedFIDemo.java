package javaeight;

import java.util.function.Predicate;

public class prdefinedFIDemo {

	public static void main(String[] args) {
		Predicate<Integer> p=(a)->a%2==0;

		System.out.println(p.test(10));
	}
	

}
