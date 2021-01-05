package javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,2,5,7,1,0,8);
		Comparator<Integer> sorted=(a,b)->(a<b)?-1:(a>b)?1:0;
		Collections.sort(list,sorted);
		System.out.println(list);
	}
}
