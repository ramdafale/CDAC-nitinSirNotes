interface emp1
{
	void disp1();  // public and abstract
}
interface emp2
{
	void disp2();
}
interface emp3 extends emp1,emp2
{
	void disp3();
}
class sub1 implements emp3
{
	public void disp1()
	{
		System.out.println("sub1 disp1");
	}
	public void disp2()
	{
		System.out.println("sub1 disp2");
	}
	public void disp3()
	{
		System.out.println("sub1 disp3");
	}
}
public class Demo35
{
	public static void main(String args[])
	{
		sub1 s1=new sub1();
		s1.disp1();
		s1.disp2();
		s1.disp3();

	}
}