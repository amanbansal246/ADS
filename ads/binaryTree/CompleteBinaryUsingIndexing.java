package ads.binaryTree;

import java.util.Vector;

public class CompleteBinaryUsingIndexing {
	static Node root;
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
		root.right.left=new Node(7);
	}
	public int size(Node root)
	{
		if(root==null)return 0;
		
		return 1+ size(root.left)+ size(root.right);
	}
	public void Inorder(Node node,Vector<Boolean> v,int i)
	{
		if(root==null) return;
		
		Inorder(node.left,v,2*i+1);
		v.add(i,true);
		Inorder(node.right,v,2*i+2);
		
	}
	public boolean IsCompleteTree(Node root,int n)
	{
		if(root==null) return true;
		
		Vector<Boolean> A=new Vector<>(n);
		for(int i=0;i<n;i++)
		{
			A.add(false);
		}
		Inorder(root,A,0);
		for(int i=0;i<n;i++)
		{
			if(A.get(i)==false)
				return false;
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		CompleteBinaryUsingIndexing cm=new CompleteBinaryUsingIndexing();
		cm.add();
		int n=cm.size(root);
		cm.IsCompleteTree(root,n);

	}

}
