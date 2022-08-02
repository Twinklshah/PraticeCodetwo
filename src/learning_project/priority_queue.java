package learning_project;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
 public static void main(String[] args) {
	Queue <Integer> pq=new PriorityQueue<>();
	// it will print the queue in reverse order
	//Queue <Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder()); 
	
	pq.offer(12);
	pq.offer(24);
	pq.offer(36);
	pq.offer(48);
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	System.out.println(pq.peek());
	
}
}
