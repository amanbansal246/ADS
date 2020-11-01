package ads.queue;
class Queue1 
{
	int []queue;
	int size;
	int rear,front;
	Queue1(int size)
	{
		rear=-1;
		front=-1;
		this.size=size;
		queue=new int[size];
	}
	public void enqueue(int data)
	{
		if((rear+1)%size==front)
		{
			System.out.println("Queue is full");
			return;
		}
		if(rear==-1 && front==-1 ) {
			rear=0;
			front=0;
		}else {
			rear=(rear+1)%size;
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
		front=(front+1)%size;
	}
	public void display()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
			return;
		}
		int i=front;
		do {
			System.out.println(queue[i]);
			i=(i+1)%size;
		}while(i!=front);
		
		
		System.out.println();
	}
}
public class CircularQueueUsingArray {
	public static void main(String[] args)
	{
		Queue q=new Queue(6);
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(10);
		q.display();
		q.dequeue();
		q.display();
	}
	
	
}
