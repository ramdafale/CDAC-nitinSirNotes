import java.io.*;
public class one
{
		public static void main(String args[])
		{
			try
			{
			saveme s=new saveme();
			s.setNum(100);
			System.out.println("Before\t"+s.getNum());
			System.out.println("Before\t"+saveme.getCnt());
			FileOutputStream fos=new FileOutputStream("ab2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s); //Serialization
			oos.close();
			fos.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
}