import mypack.*;
import java.io.*;
public class App
{
	public static void main(String args[])
	{
		MyClass1 m1=new MyClass1();
		try
		{
			System.out.println(m1.sqr(10));
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		System.out.println(m1.compare(25,75));

		MyClass1.inner i=m1.new inner();
		i.dispin();
		System.out.println("Done");
	}
}