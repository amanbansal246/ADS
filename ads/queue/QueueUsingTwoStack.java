package ads.queue;
import java.util.Stack;
public class QueueUsingTwoStack {
	public void Enqueue(Stack st1,int data)
	{
		st1.push(data);
	}
	public void dequeue(Stack st1,Stack st2)
	{
		while(!st1.empty())
			st2.push(st1.pop());
		
		st2.pop();
		
		while(!st2.empty())
			st1.push(st2.pop());
	}
	public static void main(String[] args)
	{
		QueueUsingTwoStack st=new QueueUsingTwoStack();
		Stack st1=new Stack();
		Stack st2=new Stack();
		st.Enqueue(st1,10);
		st.Enqueue(st1,20);
		st.Enqueue(st1,30);
		st.Enqueue(st1,40);
		st.Enqueue(st1,50);
		st.Enqueue(st1,60);
		
		st.dequeue(st1,st2);
		st.dequeue(st1,st2);
	}
}
