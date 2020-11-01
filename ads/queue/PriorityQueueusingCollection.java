package ads.queue;
import java.util.PriorityQueue;
public class PriorityQueueusingCollection {
	public static void main(String[] args)
	{
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("kiwi");
		pq.add("Apple");
		pq.add("Banana");
		pq.add("Mango");
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}
