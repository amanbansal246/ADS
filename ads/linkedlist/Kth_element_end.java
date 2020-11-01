package ads.linkedlist;

public class Kth_element_end {
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static Node add(int data,Node start)
	{
		Node node=new Node(data);
		if(start==null)
		{
			start=node;
			return start; 
		}
		Node temp=start;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
		return start;
	}
	public static int kElement(int k,Node start)
	{
		Node first=start;
		Node second=start;
		while(--k !=0)
		{
			first=first.next;
		}
		while(first.next!=null)
		{
			first=first.next;
			second=second.next;
		}
		return second.data;
		 
	}
	public static void main(String[] args) {
		Node start=null;
		int []a= {1,2,3,4,5};
		for(int i:a)
		{
			start=add(i,start);
		}
		System.out.println(kElement(3,start));
	}

}
