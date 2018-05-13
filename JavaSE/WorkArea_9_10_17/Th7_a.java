public class Th7_a implements Runnable
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
		Th7_a ob=new Th7_a();
		Th7_a ob1=new Th7_a();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
		t1.start();
		t2.start();
	}
}