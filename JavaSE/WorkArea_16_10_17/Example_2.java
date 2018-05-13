/*

computeIfAbsent:
/*
If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.

*/

import java.util.HashMap;
import java.util.Map;
public class Example_2
{
	public static void main(String ...arg)
	{
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i);
		}
	
		
		map.forEach((id, val) -> System.out.println(val));

		map.computeIfPresent(3, (num, val) -> val + num);
		System.out.println(map.get(3));             // val33

		

		map.computeIfAbsent(23, num -> "val" + num);
		System.out.println(map.containsKey(23));    // true

		map.computeIfAbsent(3, num -> "welcome");
		System.out.println(map.get(3));             // val33

System.out.println("Displaying map");

		System.out.println(map);
		map.replace(3, null);
		System.out.println(map);
		map.computeIfAbsent(3, num -> "hello");
		System.out.println(map);
		map.replace(33,"goodbye");
	//	map.put(33,"goodbye"); // try this
		System.out.println(map);
	}
}












