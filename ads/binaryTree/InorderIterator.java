package ads.binaryTree;
import java.util.Stack;
public class InorderIterator 
{
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
	public void inorder()
	{
		if(root==null) return;
		Node curr=root;
		Stack<Node> st=new Stack<>();
		st.push(curr);
		while(!st.empty())
		{
			if(curr!=null)
			{
				st.push(curr);
				curr=curr.left;
			}else {
				Node temp=st.pop();
				System.out.print(temp.data + " ");
				curr=temp.right;
			}
			
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
		InorderIterator it=new InorderIterator();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(5);
		it.add(6);
		it.add(7);
		
		it.inorder();
		
	}

}
