package ads.queue.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_Large_element {

	public static void main(String[] args) {
		int []arr={22,45,34,11,7,67};
		int k=3;
		PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			if(i<k)
				p.add(arr[i]);
			else
			{
				if(arr[i]>p.peek())
				{
					p.remove();
					p.add(arr[i]);
				}
			}
		}
		while(p.size()>0)
		{
			System.out.println(p.peek());
			p.remove();
		}

	}

}
