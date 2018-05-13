import java.io.*;
public class two
{
		public static void main(String args[])
		{
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