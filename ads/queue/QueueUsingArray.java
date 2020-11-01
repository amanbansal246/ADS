package ads.queue;
class Queue 
{
	int []queue;
	int size;
	int rear,front;
	Queue(int size)
	{
		rear=-1;
		front=-1;
		this.size=size;
		queue=new int[size];
	}
	public void enqueue(int data)
	{
		if(rear==size-1)
		{
			System.out.println("Queue is full");
			return;
		}
		if(rear==-1 && front==-1 ) {
			rear=0;
			front=0;
		}else {
			rear=rear+1;
		}
		queue[rear]=data;
	}
	public void dequeue()
	{
		if(front==-1 || rear==-1) {
			System.out.println("Queue is empty");
			return;
		}
		if(front==rear)
		{
			front=rear=-1;
			return;
		}
		front=front+1;
	}
	public void display()
	{
		if(front==-1 || rear==front)
		{
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front; i<=rear;i++)
		{
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
public class QueueUsingArray {
	public static void main(String[] args)
	{
		Queue q=new Queue(6);
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(7);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(10);
		q.display();
		q.dequeue();
		q.display();
	}
	
	
}
