import java.io.*;
public class saveme implements Serializable
{
	int num;
	public saveme()
	{
		System.out.println("in saveme const");
		spfun();
	}
	public void spfun()
	{
		System.out.println("I am special function");
	}
}