package learning_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratingListEx {
	public static void main(String[] args) {
		
	
	List<Integer> list3=new ArrayList<>();
	list3.add(10);
	list3.add(20);
	list3.add(30);
	list3.add(40);
	list3.add(50);
	list3.add(60);
	list3.add(70);
	list3.add(80);
	list3.add(90);
	 System.out.println(list3);
	 
	 for(int i=0;i<list3.size();i++) {
		 System.out.println("the element is :" +list3.get(i)); //way of iterating throug the list
	 }
	// another way to iterate through the list
	 for(Integer element: list3) {
		 System.out.println("for each element is" + element);
	 }
	 
	 // another way to iterate through the list is using iterator
	 Iterator <Integer> it= list3.iterator();
	   while (it.hasNext()) {
		   System.out.println("iterator"+it.next());
	
		   
	   }
	 
	 
	}
}
