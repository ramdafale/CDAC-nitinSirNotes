import java.io.*;
public class two
{
		public static void main(String args[])
		{
			try
			{
			FileInputStream fis=new FileInputStream("ab2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			saveme s1=(saveme)ois.readObject();
// Deserialization
			System.out.println("After\t"+s1.getNum());
			System.out.println("After\t"+saveme.getCnt());
			ois.close();
			fis.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
}