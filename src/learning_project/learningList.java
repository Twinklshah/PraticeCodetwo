package learning_project;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class learningList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		//List<Integer> list=new LinkedList<>(); linked list also use same function as Arraylist
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//this will add at end of list
		list.add(4);
		
	//this will add 30 at first index
		list.add(1, 30);
		System.out.println(list);
		
		//to print another list including previous list
		List<Integer> list2=new ArrayList<>();
		list2.add(120);
		list2.add(200);
		list2.addAll(list);
		System.out.println(list2);
		
		//to fetch the data from the list
		System.out.println(list2.get(0));
		// to remove element
		
		list.remove(0);
		System.out.println(list);
		//remove the element which you don't want to display
		
		list.remove(Integer.valueOf(3));
		System.out.println(list);
		
		//remove all the element in the list
		//list.clear();
		System.out.println(list);
		
		//to set the value
		list.set(2, 1701);
		System.out.println(list);
		
		//to check the element you want get
		System.out.println(list.contains(30));
		

		
		
	}

}
