import java.io.*;
public class two
{
		public static void main(String args[])
		{
			try(FileInputStream fis=new FileInputStream("..\\ab2.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			Object s1=ois.readObject();
// Deserialization
			//System.out.println(s1.num);
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
}