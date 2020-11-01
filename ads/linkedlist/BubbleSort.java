package ads.linkedlist;
public class BubbleSort {
	Node start;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void createList(int data) //create linked List
	{
		Node node=new Node(data);
		if(start==null)
			start=node;
		else {
			Node curr=start;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	public void bubbleSort()
	{
		Node p=null;
		Node q=null;
		int i=0;
		if(start==null)
			return;
		do {
			i=0;
			p=start;
			while(p.next!=q)
			{
				if(p.data>p.next.data)
				{
					int temp=p.data;
					p.data=p.next.data;
					p.next.data=temp;
					i=1;
				}
				p=p.next;
			}
			q=p;
		}while(i==1);
	}
	public void display() //display linkedlist
	{
		Node curr=start;
		while(curr!=null)
		{
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		int[] arr= {12,5,36,32,10,12,16};
		for(int x:arr)
			bs.createList(x);
		bs.display();
		bs.bubbleSort();
		bs.display();
	}

}
