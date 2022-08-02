package learning_project;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("Cat");
		animals.push("Dog");
		animals.push("Elephant");
		animals.push("Monkey");
		animals.push("camel");
		
		System.out.println("Stacks:" +animals);
		System.out.println(animals.peek());
		System.out.println(animals.pop());
		System.out.println(animals);
		System.out.println(animals.peek());
		
	//queue example
		
		Queue<Integer> que=new LinkedList<>();
		//offer add the element
		que.offer(12);
		que.offer(24);
		que.offer(36);
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		//it will display who is next in list to e remove
		System.out.println(que.peek());
		
		//note: linked list and araylist has same function used for  both
		
		
		
		
		
	}
}
