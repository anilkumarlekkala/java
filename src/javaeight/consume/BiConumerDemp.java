package javaeight.consume;

import java.util.function.BiConsumer;

import javaeight.predicate.Employee;

public class BiConumerDemp {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> c=(a,b)->System.out.println(a+b);;

		c.accept(10, 20);
	}

}
