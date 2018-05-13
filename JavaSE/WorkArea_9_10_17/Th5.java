public class Th5 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		Th5 ob=new Th5();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}