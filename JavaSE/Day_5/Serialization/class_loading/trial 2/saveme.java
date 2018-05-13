import java.io.*;
public class saveme implements Externalizable
{
	int num1;
	String s=new String("hello");
	static
	{
		System.out.println("in saveme static block");
	}
	public void readExternal(ObjectInput oi)throws IOException
	{
		System.out.println("in readExternal");
		num1=oi.readInt();
	}
	public void writeExternal(ObjectOutput oo)throws IOException
	{
		System.out.println("in writeExternal");
		oo.writeInt(num1);
	}
	public saveme()
	{
		System.out.println("in saveme const");
		num1=10;
	}
}