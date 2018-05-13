import java.io.*;
public class saveme implements Serializable
{
	private int num;
	private static int cnt=0;
	public void setNum(int num)
	{
		this.num=num;
		cnt=num;
	}
	public int getNum()
	{
		return num;
	}
	public static int getCnt()
	{
		return cnt;
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("in writeobject");
        	out.defaultWriteObject();
		out.writeInt(cnt);
    	    }

    private void readObject(ObjectInputStream in) 
	    throws IOException, ClassNotFoundException
	   {
		System.out.println("in readobject");
	        in.defaultReadObject();
	        cnt=in.readInt();
    	   }

	
}








