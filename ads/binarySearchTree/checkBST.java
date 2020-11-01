package ads.binarySearchTree;

public class checkBST {
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
		while(curr!=null)
		{
			parent=curr;
			if(data<curr.data)
			{
				curr=curr.left;
			}else if(data>curr.data)
			{
				curr=curr.right;
			}
		}
		if(data<parent.data)
			parent.left=node;
		else
			parent.right=node;
		return root;
	}
	public void inOrder(Node root)
	{
		if(root==null)return;
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);
	}
	public boolean IsBST(Node root,int min,int max)
	{
		if(root==null) return true;
		return (root.data>min && root.data<max) && IsBST(root.left,min,root.data) && IsBST(root.right,root.data,max);
	}
	public static void main(String[] args) {
		checkBST ch=new checkBST();
		Node root= null;
		int[] a= {12,5,15,3,6,8,4};
		for(int i:a)
		{
			root=ch.add(root,i);
		}
		//ch.inOrder(root);
		if(ch.IsBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
