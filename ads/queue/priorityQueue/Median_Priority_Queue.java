package ads.queue.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median_Priority_Queue {
	PriorityQueue<Integer> left;
	PriorityQueue<Integer> right;
	public Median_Priority_Queue()
	{
		left=new PriorityQueue<>(Collections.reverseOrder());
		right=new PriorityQueue<Integer>();
	}
	public void add(int val)
	{
		if(right.size()>0  && val> right.peek())
		{
			right.add(val);
		}else {
			left.add(val);
		}
			
		if(left.size()-right.size()==2)
		{
			right.add(left.remove());
		}else if(right.size()-left.size()==2) {
			left.add(right.remove());
		}
	}
	public int remove()
	{
		if(this.size()==0)
		{
			System.out.println("Underflow");
			return -1;
		}
		if(left.size()>=right.size())
		{
			return left.remove();
		}
		return right.remove();
	}
	public int peek()
	{
		if(this.size()==0)
		{
			System.out.println("Underflow");
			return -1;
		}
		if(left.size()>=right.size())
		{
			return left.peek();
		}
		return right.peek();
	}
	public int size()
	{
		return left.size()+right.size();
	}
	public static void main(String[] args) {
		Median_Priority_Queue m=new Median_Priority_Queue();
		m.add(10);
		//System.out.println(m.peek());
		m.add(20);
	//	System.out.println(m.peek());
		m.add(30);
	//	System.out.println(m.peek());
		m.add(5);
	//	System.out.println(m.peek());
		//m.add(40);
		//System.out.println(m.size());
		System.out.println(m.peek());
	}

}
//https://www.youtube.com/watch?v=dshWERdcAdg&list=PL-Jc9J83PIiHq5rMZasunIR19QG3E-PAA&index=16  