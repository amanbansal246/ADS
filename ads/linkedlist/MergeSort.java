package ads.linkedlist;

public class MergeSort {
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
	public static Node middle(Node start)
	{
		if(start==null)
			return start;
		Node first=null;
		Node second=null;
		while(second!=null && second.next!=null)
		{
			first=first.next;
			second=second.next.next;
		}
	}
	public static Node mergeSort(Node start,Node tail)
	{
		if(start==tail)
			return start;
		
		Node middle=middle(start);
		Node left=mergeSort(start,middle);
		Node right=mergeSort(middle.next,tail);
		merge(left,right);
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
		Node start=null;
		Node tail=null;
		int i[]= {15,10,25,40,22,7,19,21};
		for(int a:i)
		{
			start=add(a,start);
		}
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		mergeSort(start,tail);
		
	}
}
