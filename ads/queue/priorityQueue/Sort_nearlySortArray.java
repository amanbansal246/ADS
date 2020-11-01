package ads.queue.priorityQueue;

import java.util.PriorityQueue;

public class Sort_nearlySortArray {

	public static void main(String[] args) {
		int a[]= {2,3,1,4,6,7,5,8,9};
		int k=3;
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			p.add(a[i]);
		}
		for(int i=k+1;i<a.length;i++)
		{
			System.out.print(p.remove()+" ");
			p.add(a[i]);
		}
		while(p.size()>0)
		{
			System.out.print(p.remove()+" ");
		}
	}

}
