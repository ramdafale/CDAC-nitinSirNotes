import java.util.*;
public class Trial3
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
		Trial3 t=new Trial3();
		t.disp(m);
		Integer ob=m.get(2);
		System.out.println(ob);		


	}
}








