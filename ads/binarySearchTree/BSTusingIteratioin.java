package ads.binarySearchTree;

public class BSTusingIteratioin {
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
	public Node add(Node root,int data)
	{
		Node node=new Node(data);
		Node curr=root;
		if(curr==null)
		{	
			curr=node;
			return curr;
		}
		Node parent=null;
		while(root!=null)
		{
			parent=curr;
			if(data<root.data)
			{
				root=root.left;
			}else if(data<root.data)
			{
				root=root.right;
			}
		}
		if(data<parent.data)
			parent.left=node;
		else
			parent.right=node;
		return parent;
	}
	public void search(Node root,int data)
	{
		if(root==null)
		{
			System.out.println("Not found1");
			return;
		}
		Node curr=root;
		while(curr!=null)
		{
			if(data<curr.data)
				curr=curr.left;
			else if(data>curr.data)
				curr=curr.right;
			else
			{
				System.out.println("Data found");
				return;
			}
		}
		System.out.println("Data not found");
	}
	public void delete(Node root,int data)
	{
		
	}
	public static void main(String[] args) {
		BSTusingIteratioin bt=new BSTusingIteratioin();
		Node root= null;
		int[] a= {12,5,7,1,8,4,19};
		for(int i:a)
		{
		root=bt.add(root,i);
		}
		bt.search(root,12);
	}
}
