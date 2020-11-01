package ads.binaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class RightViewOfTree {
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
	public void rightView()
	{
		if(root==null) return;
		Queue<Node> q=new LinkedList<>();
		Node curr=root;
		q.add(curr);
		while(!q.isEmpty())
		{
			int size=q.size();
			int i=0;
			while(i++ <size)
			{
				Node temp=q.remove();
				if(i==size) //only diff bw left and right view is hare ..in left we use 1 instead of size
 					System.out.print(temp.data + " ");
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
		}
	}
	public static void main(String[] args) {
		RightViewOfTree it=new RightViewOfTree();
		it.add();
		it.rightView();
	}

}
