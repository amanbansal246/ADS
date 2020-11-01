package ads.binaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class ButtomViewOfTree {
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
		root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right.right=new Node(17);
		root.right.left=new Node(12);
	}
	public void buttomView()
	{
		if(root==null) return;
		Queue<Node> q=new LinkedList<>();
		Node curr=root;
		q.add(curr);
		while(!q.isEmpty())
		{
				Node temp=q.remove();
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				if((temp.left==null) && (temp.right==null))
					System.out.print(temp.data + " ");
			}
	}
	boolean checkBST() {
        if(root==null)return true;
        Node curr=root;
        Queue<Node> st=new LinkedList<>();
        st.add(curr);
        while(!st.isEmpty())
        {
            Node temp=st.remove();
            if(temp.left!=null)
            {
                if(temp.left.data<temp.data) 
                	st.add(temp.left);
                else
                	return false;
            }
            if(temp.right!=null)
            {
                if(temp.right.data>temp.data) 
                	st.add(temp.right);
                else
                	return false;
            }
        }
        
        return true;
    }
	public static void main(String[] args) {
		ButtomViewOfTree it=new ButtomViewOfTree();
		it.add();
		//it.buttomView();
		System.out.println(it.checkBST());
	}

}
