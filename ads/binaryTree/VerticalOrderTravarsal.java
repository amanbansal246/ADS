package ads.binaryTree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import ads.binaryTree.TopViewUsingHashMap.Node;

public class VerticalOrderTravarsal {
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
	public void printVarticalOrder()
	{
		if(root==null) return;
		Node node=root;
		int hd=0;
		TreeMap<Integer,ArrayList<Integer>> m=new TreeMap<>();
		
		getVerticalOrder(node,hd,m);
		
		for(Map.Entry<Integer,ArrayList<Integer>> cm:m.entrySet()) {
			System.out.println(cm.getValue());
		}
		
	}
	public void getVerticalOrder(Node node,int hd,TreeMap<Integer,ArrayList<Integer>> m)
	{
		if(node==null) return;
		
		if(m.get(hd)==null) {
			ArrayList<Integer> i=new ArrayList<>();
			i.add(node.data);
			m.put(hd,i);
		}else {
			ArrayList<Integer> i=m.get(hd);
			i.add(node.data);
			m.put(hd,i);
		}
		
		getVerticalOrder(node.left,hd-1,m);
		getVerticalOrder(node.right,hd+1,m);
	}
	public static void main(String[] args) {
		VerticalOrderTravarsal vt=new VerticalOrderTravarsal();
		vt.add();
		vt.printVarticalOrder();
		
	}

}
