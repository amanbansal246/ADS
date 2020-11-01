package ads.binaryTree;

public class BinaryTree {
	static Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public void preorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data + " ");
		inorder(root.left);
		inorder(root.right);
	}
	public void postorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.data + " ");
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
	public void inorder()
	{
		inorder(root);
	}
	public void preorder()
	{
		preorder(root);
	}
	public void postorder()
	{
		postorder(root);
	}
	public static void main(String []args)
	{
		BinaryTree bt=new BinaryTree();
		bt.add();
		System.out.println("Inorder Traversal");
		bt.inorder();
		System.out.println("\nPreorder Traversal");
		bt.preorder();
		System.out.println("\nPostorder Traversal");
		bt.postorder();
	}
}
