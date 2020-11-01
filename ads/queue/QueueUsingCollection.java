package ads.queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollection {
	
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(12); //add() add element and throw exception if queue is full
		q.add(24);
		q.add(36);
		
		System.out.println(q);
		System.out.println(q.remove()); //use to remove data and throw exception if queue is empty
 		System.out.println(q);
 		
 		System.out.println(q.element()); //use to peek data but throw exception if queue is empty
 		
 		//instead of add() we can use offer() which not throw any exception
 		//instead of remove() we can use poll() which not throw any exception
 		//instead of element() we can use peek() which not throw any exception
		
		
	}

}
//queue is a interface we can not crate obj of queue
//so there are three class which implements queue interface
//ArrayDeque
//LinkedList
//PriorityQueue
