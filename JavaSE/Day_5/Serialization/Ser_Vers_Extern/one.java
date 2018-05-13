import java.io.*;
public class one
{
		public static void main(String args[])
		{
			saveme ob=new saveme();
			try(FileOutputStream fos=new FileOutputStream("ab2.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(ob); //Serialization
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
System.out.println(ob.num1+"\t"+ob.s);
			ob=null;

			try(FileInputStream fis=new FileInputStream("ab2.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			saveme s1=(saveme)ois.readObject();
// Deserialization
			System.out.println(s1.num1+"\t"+s1.s);
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
}