package javaeight.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
	

		Function<String,String> f=s->s.toLowerCase();
		
		System.out.println(f.apply("ANIL"));
		
		Function<Integer, Integer> f1=i->2*i;
		Function<Integer, Integer> f2=i->i*i;
		
		
		//2*10,20*20=400
		System.out.println(f1.andThen(f2).apply(10));
		
		
		//10*10,2*100=200
		System.out.println(f1.compose(f2).apply(10));
		
	}

}
