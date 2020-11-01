/*For two trees 'a' and 'b' mirror images , the following three conditions must be same.
 * 1. Their root node's key must be same
 * 2. Left subtree of root 'a' and right subtree of 'b' are mirror
 * 3. Right subtree of 'a' and left subtree of 'b' are mirror
 * */
package ads.binaryTree;

public class MirrorTrees {
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
		root1.right.right=new Node(7);
		root1.right.left=new Node(6);
	}
	public void add2()
	{
		root2=new Node(1);
		root2.left=new Node(3);
		root2.right=new Node(2);
		root2.left.left=new Node(7);
		root2.left.right=new Node(6);
		root2.right.right=new Node(4);
		root2.right.left=new Node(5);
	}
	public boolean checkMirror(Node root1,Node root2)
	{
		if(root1==null && root2==null) return true;
		if(root1==null || root2==null) return false;
		if(root1.data==root2.data)
		{
			if(checkMirror(root1.left,root2.right) && checkMirror(root1.right,root2.left))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		MirrorTrees it1=new MirrorTrees();
		it1.add1();
		it1.add2();
		if(it1.checkMirror(root1, root2))
			System.out.println("True");
		else
			System.out.println("False");

	}
}
