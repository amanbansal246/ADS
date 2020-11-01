package ads.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;
public class HeightOfTree {
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
	public int Height()
	{
		if(root==null) return -1;
		Queue<Node> q=new LinkedList<>();
		Node curr=root;
		q.add(curr);
		int height=0;
		while(!q.isEmpty())
		{
			int size=q.size();
			while(size-- != 0)
			{
				Node temp=q.remove();
					
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
			height++;
		}
		return height;
	}
	public int checkHeight(Node root) //height using recurssion and space complexity O(1)
	{
		if(root==null) return 0;
		
		return 1+ Math.max(checkHeight(root.left),checkHeight(root.right));
	}
	public static void main(String[] args) {
		HeightOfTree it=new HeightOfTree();
		it.add();
		int height=it.Height();
		if(height==-1)
			System.out.println("Tree is empty");
		else
			System.out.println("Height of Tree is "+height);
		
		System.out.println("Height using reucrsion "+it.checkHeight(root));
		
	}


}
