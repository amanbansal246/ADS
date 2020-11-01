package ads.heap;

public class Z_practics {
	public static void Heap(int heap[],int data,int index)
	{
		heap[index]=data;
		while(index>1 && heap[index]>heap[index/2])
		{
			int temp=heap[index];
			heap[index]=heap[index/2];
			heap[index/2]=temp;
			
			index=index/2;
		}
	}
	public static void Heapify(int heap[],int size)
	{
		int i=1,index;
		while(i<=size &&  (2*i<=size && 2*i+1<=size) &&(heap[i]<heap[2*i] && heap[i]<heap[2*i+1]) )
		{
			if(heap[2*i]<heap[2*i+1])
				index=2*i;
			else
				index=2*i+1;
			
			int temp=heap[i];
			heap[i]=heap[index];
			heap[index]=temp;
			
			i=index;
		}
	}
	public static void main(String[] args) {
		Z_practics p=new Z_practics();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int n=a.length;
		int heap[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			Heap(heap,a[i],i+1);
		}
		System.out.println("Heap");
		for(int i=1;i<n+1;i++)
		{
			System.out.print(heap[i]+" ");
		}
		int size=n;
		int temp;
		while(size != 1)
		{
			temp=heap[1];
			heap[1]=heap[size];
			heap[size]=heap[1];
			size--;
			
			Heapify(heap,size);
		}
		System.out.println("\nSorted Heap");
		for(int i=1;i<n;i++)
		{
			System.out.print(heap[i]+" ");
		}
		
	}

}
