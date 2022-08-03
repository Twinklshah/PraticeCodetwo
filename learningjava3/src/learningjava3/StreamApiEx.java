package learningjava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx {
	
	public static void main(String[] args) {
		List<Integer> list5 = List.of(2,4,3,12,10,5); // we can't modify this list value will remain same.
		
		//list5.add(45);
	   // System.out.println(list5); //this is showing error unsupportedOperationException
	    
	    // to create a list which can modify 
	/*    List<Integer> list6=new ArrayList<>();
	    list6.add(24);
	    list6.add(12);
	    list6.add(24);
	    list6.add(36);   */
	    
	    // we can create list with arrayslist 
	   // List<Integer> list7 = Arrays.asList(2,3,4,5,6,8,12);
	    
	    //list5
	    //without stream to print the all even num from the list and display it with using list.
	    
	/*    List<Integer> listeven=new ArrayList<>();
	    
	    for(int i:list5) {
	    	
	    	if(i%2== 0)
	    	{
	    		listeven.add(i);
	    		
	    	}
	    	//System.out.println(i);
	    }
	    System.out.println(list5);
    	System.out.println(listeven); */
	    
	    //using stream
    	
    	Stream <Integer> stream= list5.stream();
    	
	    List<Integer> newlist=stream.filter(i ->i%2==0).collect(Collectors.toList());
	    System.out.println(newlist);
	    
	    
	    
		
	}

}
