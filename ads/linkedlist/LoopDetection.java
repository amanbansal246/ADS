package ads.linkedlist;
public class LoopDetection {
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
	public 	Node detectLoop()
	{
		Node first=start;
		Node second=start;
		if(first!=null && second!=null && second.next!=null)
		{
			first=first.next;
			second=second.next.next;
			if(first==second)
				return first;
		}
		return null;
	}
	public Node startPointOfLoop(Node p)
	{
		Node q=start;
		while(p!=q) {
			p=p.next;
			q=q.next;
		}
		return p;
	}
	public static void main(String[] args) {
		LoopDetection bs=new LoopDetection();
		
		bs.display();
		Node point=bs.detectLoop();
		if(point==null)
			System.out.println("No loop exists");
		else
		{
			System.out.println("loop found at "+point.data);
			Node st=bs.startPointOfLoop(point);
			System.out.println("Starting point of loop is "+st.data);
		}
			
		
		
	}
}
