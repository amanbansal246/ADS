package ads.linkedlist;

public class Middle_Element {
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
	public static int middleElement(Node start)
	{
		if(start==null)
		{
			System.out.println("List is empty");
			return -1;
		}
		Node fast=start;
		Node slow=start;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		Node start=null;
		int []a= {1,2,3,4,5,8};
		for(int i:a)
		{
			start=add(i,start);
		}
		System.out.println(middleElement(start));
	}

}
