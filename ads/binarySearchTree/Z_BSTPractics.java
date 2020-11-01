package ads.binarySearchTree;

import java.util.Collections;
import java.util.PriorityQueue;


class Z_BSTPractics
{
	public static void add(PriorityQueue<Integer> lft,PriorityQueue<Integer> rht,int i)
	{
		if(rht.size()>0 && rht.peek()<i)
		{
			rht.add(i);
		}else {
			lft.add(i);
		}
		
		if(rht.size()-lft.size()==2) 
		{
			lft.add(rht.remove());
		}
		else if(lft.size()-rht.size()==2)
		{
			rht.add(lft.remove());
		}
	}
	public static int peek(PriorityQueue<Integer> lft,PriorityQueue<Integer> rht)
	{
		if(lft.size()>=rht.size())
			return lft.peek();
		if(rht.size()>lft.size())
			return rht.peek();
		return lft.element();
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7};
		PriorityQueue<Integer> lft=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> rht=new PriorityQueue<>();
		for(int i:arr)
		{
			add(lft,rht,i);
		}
		System.out.println(peek(lft,rht));	
	}
}