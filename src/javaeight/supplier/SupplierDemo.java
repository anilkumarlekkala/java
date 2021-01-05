package javaeight.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> i=()->{
			String otp="";
			
			for(int j=0;j<6;j++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};

		System.out.println(i.get());
	}

}
