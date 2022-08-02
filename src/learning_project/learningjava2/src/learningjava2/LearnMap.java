package learningjava2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> num=new HashMap<>();
		num.put("twinkle", 21);
		num.put("priya", 22);
		num.put("priyanka", 23);
		
		
		if(!num.containsKey("priya")) {
		num.put("priya", 25);  // to overcome this we need to write the if condition now it won't override
		}
		
	//	num.putIfAbsent("priya", 15); //work same as if condition.
		
		//num.put("priya", 25); //it will update the current value and print it 25.
		
		// to overcome this we need to write the if condition 
		
		System.out.println(num);
	}

}
