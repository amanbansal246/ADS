//Two tree are identical when they have same data and arrangement of data is also same
package ads.binaryTree;
import java.util.LinkedList;
import java.util.Queue;

import ads.binaryTree.LeftViewOfTree.Node;
public class IdenticalTree {
	static Node root1;
	static Node root2;
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
	public void add1()
	{
		root1=new Node(1);
		root1.left=new Node(2);
		root1.right=new Node(3);
		root1.left.left=new Node(4);
		root1.left.right=new Node(5);
		root1.right.right=new Node(6);
		root1.right.left=new Node(7);
	}
	public void add2()
	{
		root2=new Node(1);
		root2.left=new Node(2);
		root2.right=new Node(3);
		root2.left.left=new Node(4);
		root2.left.right=new Node(5);
		root2.right.right=new Node(6);
		root2.right.left=new Node(7);
	}
	public boolean checkIdentical()
	{
		Node curr1=root1;
		Node curr2=root2;
		if(curr1==null && curr2==null) return false;
		Queue<Node> q1=new LinkedList<>();
		Queue<Node> q2=new LinkedList<>();
		q1.add(curr1);
		q2.add(curr2);
		while(!q1.isEmpty() && !q2.isEmpty())
		{
			Node temp1=q1.element();
			Node temp2=q2.element();
			if(temp1.data!=temp2.data) return false;
			
			q1.remove();q2.remove();
			
			if(temp1.left!=null && temp2.left!=null)
			{
				q1.add(temp1.left);
				q2.add(temp2.left);
			}else if ((temp1.left!=null && temp2.left==null) || (temp1.left==null && temp2.left!=null))
				return false;

			if(temp1.right!=null && temp2.right!=null)
			{
				q1.add(temp1.right);
				q2.add(temp2.right);
			}else if ((temp1.right!=null && temp2.right==null) || (temp1.right==null && temp2.right!=null))
				return false;	
		}
		return true;
	}
	public boolean checkIdenticalRecursion(Node root1,Node root2) //with reucrsion space com O(1)
	{
		if(root1==null && root2==null) return true;
		
		return (root1!=null && root2!=null) && (root1.data==root2.data) &&  checkIdenticalRecursion(root1.left,root2.left) && checkIdenticalRecursion(root1.right,root2.right);
	}
	public static void main(String[] args) {
		IdenticalTree it1=new IdenticalTree();
		it1.add1();
		it1.add2();
		if(it1.checkIdentical())
			System.out.println("True");
		else
			System.out.println("False");
		
		if(it1.checkIdenticalRecursion(root1,root2))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
