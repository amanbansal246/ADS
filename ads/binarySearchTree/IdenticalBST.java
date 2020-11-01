package ads.binarySearchTree;

public class IdenticalBST {
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
	public boolean checkIdentical(Node root1,Node root2)
	{
		if(root1==null && root2==null) return true;
	
		if((root1.data!=root2.data)) return false;
 	
		return checkIdentical(root1.left,root2.right) && checkIdentical(root1.right,root2.right);
	}
	public static void main(String[] args) {
		IdenticalBST id=new IdenticalBST();
		Node root1= null;
		Node root2= null;
		int[] x= {15,25,20,22,30,18,10,8,9,12,6};
		int[] y= {15,10,12,8,25,30,6,20,18,9,22};
		for(int i:x)
		{
			root1=id.add(root1,i);
		}
		for(int i:y)
		{
			root2=id.add(root2,i);
		}
		if(id.checkIdentical(root1,root2))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
