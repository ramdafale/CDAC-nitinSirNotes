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
	
}