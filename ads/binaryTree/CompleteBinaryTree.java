package ads.binaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class CompleteBinaryTree {
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
	public boolean IsCompleteBinary(Node root)
	{
		if(root==null) return true;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		boolean flag=false;
			while(q.size() !=0 )
			{
				Node temp=q.remove();
				if(flag==true && (temp.left!=null || temp.right!=null))
					return false;
				if(temp.left==null && temp.right!=null) return false;
				
				if(temp.left!=null)
					q.add(temp.left);
				else
					flag=true;
				if(temp.right!=null)
					q.add(temp.right);
				else
					flag=true;
			}	
		return true;
	}
	public static void main(String[] args) {
		CompleteBinaryTree it=new CompleteBinaryTree();
		it.add();
		if(it.IsCompleteBinary(root))
			System.out.println("Complete Binary Tree");
		else
			System.out.println("Not");
	}

}
