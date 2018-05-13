// in this program, since "return" is given inside "finally",compiler will remove "return" statements from both "try" and "catch" blocks.

public class Example12_temp_1
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
		if(k>0)
		{
			
			disp(k--);
		}
		else
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
		}
	}
	public static void main(String args[])
	{
		Example12_temp_1 e=new Example12_temp_1();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}





				