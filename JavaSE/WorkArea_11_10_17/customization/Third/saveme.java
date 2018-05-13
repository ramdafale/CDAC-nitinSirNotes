/*
It would appear that when you call ObjectOutputStream.writeObject( ), the Serializable object that you pass it to is interrogated (using reflection, no doubt) to see if it implements its own writeObject( ). If so, the normal serialization process is skipped and the writeObject( ) is called. The same sort of situation exists for readObject( ).

*/

import java.io.*;
class Part implements Serializable
{
	int val;
	public Part()
	{
		System.out.println("in Part constructor");
	}
	public void setVal(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
}
class base implements Serializable
{
	private int var;
	public base()
	{
		System.out.println("in base constructor");
	}
	public void setVar(int var)
	{
		this.var=var;
	}
	public int getVar()
	{
		return var;
	}
}
public class saveme extends base
{
	int num;
	private Part part=new Part();
	public saveme()
	{
		System.out.println("in saveme const");
		spfun();
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public Part getPart()
	{
		return part;
	}
	public void spfun()
	{
		System.out.println("I am special function");
	}
	 /* private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("in writeobject");
        	out.defaultWriteObject();
    	    }

    private void readObject(ObjectInputStream in) 
	    throws IOException, ClassNotFoundException
	   {
		System.out.println("in readobject");
	        in.defaultReadObject();
	        spfun();
    	   }*/

}





