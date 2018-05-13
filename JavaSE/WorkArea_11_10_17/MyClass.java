import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Outer implements Serializable
{
	class inner implements Externalizable
	{
		int num=10;
		public inner()
		{
			System.out.println("in inner default constructor");
		}

		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			// TODO Auto-generated method stub
			out.writeInt(num);
			
		}

		@Override
		public void readExternal(ObjectInput in) throws IOException,
				ClassNotFoundException {
			// TODO Auto-generated method stub 
			int k=in.readInt();
			
		}
	}
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		Outer.inner i=o.new inner();
		Outer.inner ref=null;
		
		try
		{
		FileOutputStream fos=new FileOutputStream("d:\\try.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(i);
		System.out.println("writing is over");
		FileInputStream fis=new FileInputStream("d:\\try.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ref=(Outer.inner)ois.readObject();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		System.out.println(ref.num);

	}

}