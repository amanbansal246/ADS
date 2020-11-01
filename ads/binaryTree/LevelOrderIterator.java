package ads.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterator {
	Node root;
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
	public void add(int data)
	{
		add(root,data);
	}
	public void add(Node temp,int data)
	{
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		root.right.left=new Node(6);
	}
	public void levelorder()
	{
		Node curr=root;
		if(root==null) return;
		Queue<Node> q=new LinkedList<>();
		q.add(curr);
		while(!q.isEmpty())
		{
			Node temp=q.remove();
			System.out.print(temp.data + " ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	public static void main(String[] args) {
		LevelOrderIterator it=new LevelOrderIterator();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		
		it.levelorder();	

	}

}
