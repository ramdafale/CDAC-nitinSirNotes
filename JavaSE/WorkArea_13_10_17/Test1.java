import java.util.*;
class Person implements Comparable
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	private String name;

	public Person(String name) {
		
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return name.compareTo(((Person)o).name);
	}
	
}

public class Test1
{
  public static void main(String[] args)
  {
 Person p1=new Person("abc");
 Person p2=new Person("xyz");
 TreeMap<Person,Integer>ref1=new TreeMap<Person,Integer>();
 ref1.put(p1, 100);
 ref1.put(p2, 200);
 System.out.println(ref1);
}
}












