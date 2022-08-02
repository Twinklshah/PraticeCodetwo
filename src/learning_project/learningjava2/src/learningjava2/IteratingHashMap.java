package learningjava2;

import java.util.HashMap;
import java.util.Map;

public class IteratingHashMap {
	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<>();
		//Map<String,Integer> map1=new TreeMap<>(); //same functions as HashMap treemap work in sorting order
		
		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		map1.put("four", 4);
		map1.put("five", 5);
		
		System.out.println(map1);
		
		
        System.out.println(map1.containsValue(3)); // to check the value 3 is present or not.

       // System.out.println(map1.isEmpty()); // to check the map value is empty or not
		
		for (Map.Entry<String, Integer> e: map1.entrySet()) {
		   System.out.println(e);
		   
		   System.out.println(e.getKey()); // to fetch the key value
          System.out.println(e.getValue());
		   }
		
		 for (String key: map1.keySet()) { //this will iterate through key
            System.out.println(key);
     }
       for(Integer value: map1.values()) { //this will iteratae through values
           System.out.println(value);
       }
	}

}
