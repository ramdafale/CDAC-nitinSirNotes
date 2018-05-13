/*

putIfAbsent prevents us from writing additional if null checks; forEach accepts a consumer to perform operations for each value of the map.

*/



import java.util.HashMap;
import java.util.Map;

public class Example_1
{
	public static void main(String ...arg)
	{
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) 
		{
		    map.putIfAbsent(i, "val" + i);
		}

		map.forEach((id, val) -> System.out.println(val));
		//map.put(10,null);
		map.put(10,"welcome");
		map.putIfAbsent(10,"hello");
		map.forEach((id, val) -> System.out.println(val));
	}
}
/*

output:

val0
val1
val2
val3
val4
val5
val6
val7
val8
val9

*/