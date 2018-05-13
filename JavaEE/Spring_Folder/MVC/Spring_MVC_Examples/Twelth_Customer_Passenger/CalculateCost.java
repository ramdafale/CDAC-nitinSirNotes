package mypack;

import java.util.List;

public class CalculateCost 
{
	public static int calc(Customer customer)
	{
		int total=0;
		List<Passenger>mylist=(List<Passenger>) customer.getPassengers();
		for(int i=0;i<mylist.size();i++)
		{
			Passenger ref=mylist.get(i);
			if(ref.getAge()<12)
			{
				total+=2000;
			}
			else
			{
				total+=5000;
			}
		}
		return total+5000;
		}
}
