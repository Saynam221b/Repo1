package OOps;

import java.util.HashMap;
import java.util.Map;


public class HashMaps extends Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, Integer> mp = new HashMap<String, Integer>();
		mp.put("a", (100)); // to put val in key here key is string and int will store value
		mp.put("b", (200));
		mp.put("c", (300));
		mp.put("d", (200)); 
		
		System.out.println("Value for key a = "+mp.get("a"));// to get specific val from key
		System.out.println(mp);
		
	}

}
