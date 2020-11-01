package ads.binaryTree;

import java.util.Vector;

public class AllPathDisplay {
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
	public boolean isLeafNode(Node node)
	{
		if(node==null) return false;
		if(node.left==null && node.right==null)
			return true;
		else
			return false;
	}
	public void printRootToLeaf(Node root)
	{
		if(root==null) return;
		Vector<Node> v=new Vector<>();
		printRootToLeafImpl(root,v);
		
	}
	public void printRootToLeafImpl(Node node,Vector<Node> v)
	{
		if(node==null) return;
		v.add(node);
		if(isLeafNode(node)) 
		{
			for(Node temp:v)
			{
				System.out.print(temp.data + " ");
			}
			System.out.println();
			v.remove(node);
		}
		printRootToLeafImpl(node.left,v);
		printRootToLeafImpl(node.right,v);
		
	}
	public static void main(String[] args) {
		AllPathDisplay ap=new AllPathDisplay();
		ap.add();
		ap.printRootToLeaf(root);

	}

}
