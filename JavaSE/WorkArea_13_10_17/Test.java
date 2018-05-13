import java.util.*;
class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
public class Test
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