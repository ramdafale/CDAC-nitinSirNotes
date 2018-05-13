import java.util.*;
class Person 
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getName() {
		return name;
	}

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
}
class MyComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Test2
{
  public static void main(String[] args)
  {
 Person p1=new Person("abc");
 Person p2=new Person("xyz");
 TreeMap<Person,Integer>ref1=new TreeMap<Person,Integer>(new MyComparator());
 ref1.put(p1, 100);
 ref1.put(p2, 200);
 System.out.println(ref1);
}
}


