import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUsage
{
	public static void main(String args[])
	{
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		System.out.println("Displaying numbers");
		condition(list,(n)->true);
		System.out.println("   ");
		System.out.println("Displaying empty sets");
		condition(list,(n)->false);
		System.out.println("   ");
		System.out.println("Displaying even numbers");
		condition(list,(n)->n%2==0);
		System.out.println("   ");
		System.out.println("Displaying odd numbers");
		condition(list,(n)->n%2==1);
		System.out.println("   ");
		System.out.println("Displaying numbers greater than 3");
		condition(list,(n)->n>3);
		System.out.println("   ");
	}
	public static void condition(List<Integer>list,Predicate<Integer>predicate)
	{
		for(Integer n:list)
		{
			if(predicate.test(n))
			{
				System.out.println(n +"");
			}
		}
	}
}













