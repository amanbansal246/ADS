package ads.stack;

import java.util.Scanner;

class Stack1
{
	Node top;
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
		public void push(int data)
		{
			Node node=new Node(data);		
			if(node==null)
				System.out.println("overflow");
			if(top==null)
			{
				top=node;
			}
			else
			{
				node.next=top;
				top=node;
			}
		}
		public void pop()
		{
			if(top==null) {
				System.out.println("underflow");
				return;
			}
			Node curr=top;
			top=curr.next;
			curr.next=null;
		}
		public void peek()
		{
			if(top==null) {
				System.out.println("stack is empty");
				return;
			}
			System.out.println(top.data);
		}
		public void display()
		{
			if(top==null) {
				System.out.println("stack is empty");
				return;
			}	
			Node curr=top;
			while(curr!=null)
			{
				System.out.println(curr.data);
				curr=curr.next;
			}
		}
}
public class StackUsingLinkedList {
	
	public StackUsingLinkedList() {
		Stack1 st=new Stack1();
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice:\n1.Push\n2.Pop\n3.Peek\n4.Display\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter data");
				int data=sc.nextInt();
				st.push(data);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.peek();
				break;
			case 4:
				st.display();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}while(true);		
		
	}

}
