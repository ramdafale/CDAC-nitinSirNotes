public class Th9_a implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
				System.out.println("Hello"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Th9_a ob=new Th9_a();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Both the threads are over");
	}
}








