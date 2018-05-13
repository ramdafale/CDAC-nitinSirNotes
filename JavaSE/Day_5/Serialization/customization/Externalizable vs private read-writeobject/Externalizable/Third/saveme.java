/*
It would appear that when you call ObjectOutputStream.writeObject( ), the Serializable object that you pass it to is interrogated (using reflection, no doubt) to see if it implements its own writeObject( ). If so, the normal serialization process is skipped and the writeObject( ) is called. The same sort of situation exists for readObject( ).

*/

import java.io.*;
class Part implements Externalizable
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
	
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			// TODO Auto-generated method stub
			System.out.println("inside part writeExternal method");
			out.writeInt(val);
			
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException,
				ClassNotFoundException {
			// TODO Auto-generated method stub
			System.out.println("inside part readExternal method");
			val=in.readInt();
			
		}
}
class base implements Externalizable
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
	 
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			// TODO Auto-generated method stub
			System.out.println("inside base writeExternal method");
			out.writeInt(var);	
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException,
				ClassNotFoundException {
			// TODO Auto-generated method stub
			System.out.println("inside base readExternal method");
			var=in.readInt();	
		} 
}
public class saveme extends base implements Externalizable
{
	int num;
	//private int cnt;
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
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		super.writeExternal(out);
		System.out.println("inside saveme writeExternal method");
		out.writeInt(num);
		part.writeExternal(out);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		super.readExternal(in);
		System.out.println("inside saveme readExternal method");
		num=in.readInt();
		part.readExternal(in);
	}
	  
}