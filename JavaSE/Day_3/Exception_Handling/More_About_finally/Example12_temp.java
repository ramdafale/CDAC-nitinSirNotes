// in this program, since "return" is given inside "finally",compiler will remove "return" statements from both "try" and "catch" blocks.

public class Example12_temp
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
			return 3;
		}
		return 4;
	}
	public static void main(String args[])
	{
		Example12_temp e=new Example12_temp();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}





				