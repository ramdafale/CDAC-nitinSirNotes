import java.io.*;
public class saveme implements Serializable
{
	int num;
	public saveme()
	{
		System.out.println("in saveme const");
		spfun();
	}
	public void spfun()
	{
		System.out.println("I am special function");
	}
	  private/*public*//*protected*/ void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("in writeobject");
        	out.defaultWriteObject();
    	    }

    private/*public*//*protected*/ void readObject(ObjectInputStream in) 
	    throws IOException, ClassNotFoundException
	   {
		System.out.println("in readobject");
	        in.defaultReadObject();
	        spfun();
    	   }

}