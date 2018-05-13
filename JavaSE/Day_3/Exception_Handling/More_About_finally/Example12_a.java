// finally will not be invoked since unhandled exception is raised inside finally block

public class Example12_a
{
	void accept(int k)
	{
		if(k<=0)
		{
			throw new RuntimeException("invalid value");
		}
	}
	int disp(int k)
	{ 
		try
		{
			accept(k);
			return 1;
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally
		{
			String s=null;
			System.out.println(s.length());
			return 3;
		}
	}
	public static void main(String args[])
	{
		Example12_a e=new Example12_a();
		//System.out.println(e.disp(5));
		System.out.println(e.disp(-5));
	}
}
				