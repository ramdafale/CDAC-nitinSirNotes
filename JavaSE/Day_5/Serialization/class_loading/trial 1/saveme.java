import java.io.*;
public class saveme implements Serializable
{
	int num;
	static
	{
		System.out.println("in saveme static block");
	}
	public saveme()
	{
		System.out.println("in saveme const");
		num=10;
	}
}