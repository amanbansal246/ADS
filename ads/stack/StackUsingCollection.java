package ads.stack;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;
public class StackUsingCollection {

	public static void main(String[] args) {
		Stack st=new Stack();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice:\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Empty or Not\n6.Search Element\n7.Element position\n9.Size\n9.Exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: //pust data
				System.out.println("Enter data");
				int data=sc.nextInt();
				st.push(data);
				break;
			case 2: //pop data
				try {
					System.out.println(st.pop());
				}catch(EmptyStackException e)
				{
					System.out.println("Stack is empty");
				}
				break;
			case 3: //peek data
				try {
					System.out.println(st.peek());
				}catch(EmptyStackException e)
				{
					System.out.println("Stack is empty");
				}
				break;
			case 4: //display data
				Enumeration e=Collections.enumeration(st);
				System.out.println("Elements are...");
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}
				
				break;
			case 5: //check is empty
				System.out.println(st.empty());
				break;
			case 6: //search a value from stack
				System.out.println("enter value");
				int val=sc.nextInt();
				int v=st.search(val);
				if(v==-1)
					System.out.println("value not found");
				else 
					System.out.println(v);
				break;
			case 7: //find position of element
				System.out.println("enter value");
				int valu=sc.nextInt();
				try {
					System.out.println(st.elementAt(valu));
				}catch(ArrayIndexOutOfBoundsException e1) {System.out.println("Out of index");}
				
				break;
			case 9:
				System.out.println(st.size());
				break;
			case 8: //exits
				System.exit(0);
				break;
			}
		}while(true);		
	}

}
