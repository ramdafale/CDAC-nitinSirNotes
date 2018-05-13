import java.util.*;
public class Trial2
{
	 void disp(List mylist)
	{
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		mylist.add("hello");
	}
	public static void main(String args[])
	{
		List<Integer>m=new ArrayList<Integer>();
		m.add(20);
		m.add(40);
		Trial2 t=new Trial2();
		t.disp(m);


	}
}