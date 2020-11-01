package ads.stack;
import java.util.Scanner;
class Stack
{
	int top;
	int[] stack;
	int size;
	Stack(int size)
	{
		this.size=size;
		stack=new int[size];
		top=-1;
	}
	public void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("Overflow");
			return;
		}
		top=top+1;
		stack[top]=data;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return 0;
		}
		int pop=stack[top];
		top=top-1;
		return pop;
	}
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return;
		}
		System.out.println(stack[top]);
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return;
		}
		for(int i=top;i>=0;i--)
			System.out.println(stack[i]);
		
	}
}
public class stackUsingArray {
	public static void main(String[] args) {
		Stack st=new Stack(5);
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice:\n1.Push\n2.Pop\n3.Peek\n4.Display\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter data");
				int data=sc.nextInt();
				st.push(data);
				break;
			case 2:
				int pop=st.pop();
				System.out.println("Popper item "+pop);
				break;
			case 3:
				st.peek();
				break;
			case 4:
				st.display();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}while(true);		
	}

}
