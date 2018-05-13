/*

Merge either put the key/value into the map if no entry for the key exists, or the merging function will be called to change the existing value.

*/


import java.util.HashMap;
import java.util.Map;

 
public class Example_4
{
	public static void main(String ...arg)
	{
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 8; i++) {
		    map.putIfAbsent(i, "val" + i);
		}
		
		System.out.println(map);
		map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
		System.out.println(map.get(9));             // val9

		System.out.println(map.merge(9, "concat", (value, newValue) -> value.concat(newValue)));
		System.out.println("Displaying map");
		System.out.println(map);

	}
}



/*

output:

{0=val0, 1=val1, 2=val2, 3=val3, 4=val4, 5=val5, 6=val6, 7=val7}
val9
val9concat
Displaying map
{0=val0, 1=val1, 2=val2, 3=val3, 4=val4, 5=val5, 6=val6, 7=val7, 9=val9concat}


*/
