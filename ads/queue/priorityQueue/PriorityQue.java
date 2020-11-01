package ads.queue.priorityQueue;
import java.util.PriorityQueue;
import java.util.Collections;
public class PriorityQue
{
	public static void main(String[] args) {
    PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
    int []arr={22,45,34,11,7,67};
    for(int i:arr)
    {
        p.add(i);
    }
    int i=1;
    while(p.size()>0)
    {
        System.out.println(p.peek());
        p.remove();
    }
}
}

