package ads.linkedlist;
public class PalindromList {
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
	public int palindrom()
	{
		//first find middle point
		
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = start; 
 
		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
 
		//ptr1 at middle point and ptr2 at last
	    
		//reverse list from middle+1 to last
		Node pre=null;
		Node curr=slowPointer.next;
		Node nxt=null;
		while(curr!=null)
		{
			nxt=curr.next;
			curr.next=pre;
			pre=curr;
			curr=nxt;
		}
		slowPointer.next=pre;
		
		//compare each element form start and middle+1
		Node p=start;
		while(pre!=null)
		{
			if(p.data!=pre.data)
				return 1;
			else{
				pre=pre.next;
				p=p.next;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		PalindromList pl=new PalindromList();
		int[] arr= {1,2,1};
		for(int x:arr)
		{
			pl.createList(x);
		}
		if(pl.palindrom()==1)
			System.out.println("Not palindrom");
		else
			System.out.println("Palindrom");
			
	}

}
