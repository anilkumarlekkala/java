package javaeight.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("anil", 10000L);
		Employee e2=new Employee("nagul", 20000L);
		Employee e3=new Employee("prany", 30000L);
		Employee e4=new Employee("nikhitha",40000L);
		
		
		List<Employee> list=Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1=(e)->e.getSalary()>10000;
		Predicate<Employee> p2=e->e.getEname().startsWith("n");
		
		for(Employee e:list)
		{
			if(p1.and(p2).test(e))
			{
				System.out.println(e);
			}
		}
		System.out.println();
		
		for(Employee e:list)
		{
			if(p1.or(p2).test(e))
			{
				System.out.println(e);
			}
		}
	}

}
