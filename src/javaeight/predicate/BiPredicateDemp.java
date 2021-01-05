package javaeight.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemp {

	public static void main(String[] args) {


		BiPredicate<Integer,Integer> c=(a,b)->(a+b)%2==0;
		
		System.out.println(c.test(10, 20));

	}

}
