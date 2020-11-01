package ads.binaryTree;
import java.util.Stack;

import ads.binaryTree.InorderIterator.Node;

public class PreOrderIterator {
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
	public void preorder()
	{
		Node curr=root;
		if(root==null)return;
		Stack<Node> st=new Stack<>();
		st.push(curr);
		while(!st.empty())
		{
			Node temp=st.pop();
			System.out.print(temp.data + " ");
			if(temp.right!=null)
				st.push(temp.right);
			if(temp.left!=null)
				st.push(temp.left);
		}
	}
	public static void main(String[] args) {
		PreOrderIterator it=new PreOrderIterator();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		
		it.preorder();

	}

}
