package ads.linkedlist;

public class LinkedList {
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
	public static Node addAt(int data,int n,Node temp)
	{
		if(n<0)
		{
			System.out.println("Invalid index");
			return temp;
		}
		Node node=new Node(data);
		if(temp==null)
		{
			temp=node;
			return temp;
		}
		Node t=temp;
		int i=1;
		while(i!=n-1 )
		{
			t=t.next;
			i++;
		}
		node.next=t.next;
		t.next=node;
		return temp;
	}
	public static int getValue(int n,Node start)
	{
		if(n<0)
		{
			System.out.println("Invalid index");
			return -1;
		}else if(start==null)
		{
			System.out.println("list is empty");
			return -1;
		}
		Node temp=start;
		int pos=n+1;
		int i=1;
		while(i!=pos)
		{
			i++;
			if(temp==null)
			{
				System.out.println("Invalid index");
				return -1;
			}
			temp=temp.next;
		}
		return temp.data;
		
	}
	public static Node removeIndex(int idx,Node start)
	{
		if(start==null)
		{
			System.out.println("list is empty");
			return start;
		}
		Node temp=start;
		Node pre=start;
		int pos=idx+1;
		int i=1;
		while(i!=pos)
		{
			i++;
			if(temp==null)
			{
				System.out.println("Invalid index");
				return temp;
			}
			pre=temp;
			temp=temp.next;
		}
		pre.next=temp.next;
		return start;
	}
	public static void display(Node start)
	{
		Node temp=start;
		if(temp==null)
		{
			System.out.println("Empty list");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static Node reverse(Node start)
	{
		Node pre=null,curr=start,nxt=start;
		while(curr!=null)
		{
			nxt=curr.next;
			curr.next=pre;
			pre=curr;
			curr=nxt;
		}
		start=pre;
		return pre;
	}
	public static void main(String[] args) {
		Node start=null;
		LinkedList z=new LinkedList();
		display(start);
		int a[]= {1,2,3,4,5,6,7,8,9};
		for(int i:a)
		{
			start=add(i,start);
		}
		display(start);
		start=addAt(12,4,start);
		System.out.println();
		display(start);
		System.out.println();
		System.out.println("value at 6th index "+getValue(6,start));
		start=reverse(start);
		display(start);
		removeIndex(3,start);
		System.out.println();
		display(start);
	}
}
