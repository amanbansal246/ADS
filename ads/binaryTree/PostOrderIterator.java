package ads.binaryTree;
import java.util.Stack;

import ads.binaryTree.InorderIterator.Node;
public class PostOrderIterator {
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
	public void postorder()
	{
		Node curr=root;
		if(root==null) return;
		Stack<Node> st1=new Stack<>();
		Stack<Node> st2=new Stack<>();
		
		st1.push(curr);
		while(!st1.empty())
		{
			Node temp=st1.pop();
			st2.push(temp);
			if(temp.right!=null)
				st1.push(temp.right);
			if(temp.left!=null)
				st1.push(temp.left);
		}
		while(!st2.empty())
		{
			Node temp=st2.pop();
			System.out.print(temp.data + " ");
		}
		
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
	public static void main(String[] args) {
		
		PostOrderIterator it=new PostOrderIterator();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		
		it.postorder();
	}

}
