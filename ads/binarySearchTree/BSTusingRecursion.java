package ads.binarySearchTree;

public class BSTusingRecursion {
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
		if(root==null) 
			return new Node(data);
		if(data<root.data)
			root.left=add(root.left,data);
		else
			root.right=add(root.right,data);
		
		return root;
	}
	public void search(Node root,int data)
	{
	
		if(root==null) 
		{
			System.out.println("Not found");
			return;
		}
			
		if(data<root.data)
			search(root.left,data);
		else if(data>root.data)
			search(root.right,data);
		else {
			System.out.println("Data found");
		}
	}
//	public Node delete(Node root,int data)
//	{
//		if(root==null) return root;
//		if(data<root.data)
//			delete(root.left,data);
//		else if(data>root.data)
//			delete(root.right,data);
//		else {
//			if(root.left==null && root.right==null)
//			{
//				
//			}else if(root.left!=null && root.right!=null)
//			{
//				
//			}else {
//				
//			}
//		}
//		 
//	}
	public static void main(String[] args)
	{
		BSTusingRecursion bt=new BSTusingRecursion();
		Node root= null;
		int[] a= {12,5,7,1,8,4,19};
		for(int i:a)
		{
			root=bt.add(root,i);
		}
		bt.search(root,10);
	}
}
