package javaeight;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			Thread.sleep(100); 
			System.out.println(i);
		}
	}

}
