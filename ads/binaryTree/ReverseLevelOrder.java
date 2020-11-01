package ads.binaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ads.binaryTree.LevelOrderIterator.Node;
public class ReverseLevelOrder {
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
	public void ReverseLevelOrder()
	{
		if(root==null) return;
		Node curr=root;
		Queue<Node> q=new LinkedList();
		Stack<Integer> st=new Stack<>();
		q.add(curr);
		while(!q.isEmpty())
		{
			Node temp=q.remove();
			st.push(temp.data);
			if(temp.right!=null)
				q.add(temp.right);
			if(temp.left!=null)
				q.add(temp.left);
		}
		while(!st.empty())
		{
			System.out.print(st.pop()+ " ");
		}
		
	}
	public static void main(String[] args) {
		ReverseLevelOrder it=new ReverseLevelOrder();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		
		it.ReverseLevelOrder();	
	}

}
