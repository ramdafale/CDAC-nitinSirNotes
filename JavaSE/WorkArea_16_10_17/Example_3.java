/*

 getOrDefault(Object key, V defaultValue) 


Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. 

*/


import java.util.HashMap;
import java.util.Map;

 
public class Demo1
{
	public static void main(String ...arg)
	{
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i);
		}
		
		System.out.println(map);
		System.out.println(map.getOrDefault(42, "not found")); 
		System.out.println(map.getOrDefault(4, "not found"));  

	}
}


/*

output:

{0=val0, 1=val1, 2=val2, 3=val3, 4=val4, 5=val5, 6=val6, 7=val7, 8=val8, 9=val9}
not found
val4


*/