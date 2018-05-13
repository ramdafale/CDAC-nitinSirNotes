// deep copy using in-memory serialization
import java.io.*;
class MyClass implements Serializable
{
	int num;
}
public class Demo 
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		m1.num=100;
		ByteArrayOutputStream bos1=null;
		try(ByteArrayOutputStream bos=new ByteArrayOutputStream())
		{
		try(ObjectOutputStream oos=new ObjectOutputStream(bos))
		{
			bos1=bos;
			oos.writeObject(m1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		}
		catch(Exception ee1)
		{
			ee1.printStackTrace();
		}
		m1.num=200;
		System.out.println("m1 data is\t"+m1.num);
		MyClass ref=null;
		try(ByteArrayInputStream bis=new ByteArrayInputStream(bos1.toByteArray()))
		{
		try(ObjectInputStream ois=new ObjectInputStream(bis))
		{
			ref=(MyClass)ois.readObject();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		}
		catch(Exception ee1)
		{
			ee1.printStackTrace();
		}
		System.out.println("ref data is\t"+ref.num);
	}
}	
		