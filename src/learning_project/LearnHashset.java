package learning_project;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashset {     //hashset never take duplicate value 
  public static void main(String[] args) {
	//Set<Integer> set=new HashSet<>();
	//Set<Integer> set=new LinkedlistSet<>();
	  Set <Integer> set=new TreeSet<>(); //same function used in treeset ut in sorted order.
	
	
	set.add(32);
	set.add(2);
	set.add(54);
	set.add(21);
	set.add(65);
	
	System.out.println(set);
	
	System.out.println(set.contains(21));
	System.out.println(set.isEmpty());
	System.out.println(set.size());
	set.clear();
	System.out.println(set);
}
}
