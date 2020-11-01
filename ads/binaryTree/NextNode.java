package ads.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class NextNode {
	Node root;
	Node nullptr=null;
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	public void add()
	{
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		root.right.left=new Node(6);
	}
	public Node checkNext(int value)
	{
		Node curr=root;
		if(root==null) return nullptr;
		Queue<Node> q=new LinkedList<>();
		q.add(curr);
		while(!q.isEmpty())
		{
			int size=q.size();
			while(size-- != 0)
			{
				Node temp=q.remove();
				if(temp.data==value)
				{
					if(size==0)
						return nullptr;
					else
						return q.element();
				}
				if(root.left!=null)
					q.add(root.left);
				if(root.right!=null)
					q.add(root.right);
			}
		}
		return nullptr;
	}
	public static void main(String[] args) {
		NextNode it=new NextNode();
		it.add();
		Node next=it.checkNext(2);	
		System.out.println(next.data);
	}
}
