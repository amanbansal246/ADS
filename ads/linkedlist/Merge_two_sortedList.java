package ads.linkedlist;

public class Merge_two_sortedList {
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
	public static Node merge(Node start1,Node start2)
	{
		Node temp1=start1;
		Node temp2=start2;
		Node res=null;
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data<temp2.data)
			{
				res=addLast(temp1.data,res);
				temp1=temp1.next;
			}else {
				res=addLast(temp2.data,res);
				temp2=temp2.next;
			}
		}
		while(temp1!=null)
		{
			res=addLast(temp1.data,res);
			temp1=temp1.next;
		}
		while(temp2!=null)
		{
			res=addLast(temp2.data,res);
			temp2=temp2.next;
		}
		return res;
	}
	public static Node addLast(int data,Node start)
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
	public static void main(String[] args)
	{
		Node start1=null;
		Node start2=null;
		Merge_two_sortedList m=new Merge_two_sortedList();
		int i[]= {5,10,15,20,25,67,89,90};
		int j[]= {3,8,9,13,22};
		for(int a:i)
		{
			start1=add(a,start1);
		}
		for(int b:j)
		{
			start2=add(b,start2);
		}
		Node res=merge(start1,start2);
		display(res);
	}
}
