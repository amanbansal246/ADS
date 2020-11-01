package ads.heap;

public class MaxHeap {
	public static void Heap(int data,int a[],int i)
	{
		a[i]=data;
		while(i>1 && a[i]>a[i/2])
		{
			int temp=a[i];
			a[i]=a[i/2];
			a[i/2]=temp;
			i=i/2;
		}
	}
	public static void Heapify(int heap[],int size)
	{
		int i=1,index,temp;
		while(i<=size && 2*i<=size && 2*i+1<=size && (heap[i]<heap[2*i] || heap[i]<heap[2*i+1]) )
		{
			if(heap[2*i]>heap[2*i+1])
				index=2*i;
			else
				index=2*i+1;
			temp=heap[i];
			heap[i]=heap[index];
			heap[index]=temp;
			
			i=index;
		}
	}
	public static void main(String[] args) {
	//MaxHeap m=new MaxHeap();
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	int heap[] =new int[n+1];
	heap[0]=0;
	for(int i=0;i<n;i++)
	{
		Heap(arr[i],heap,i+1);
	}
	System.out.println("Heap");
	for(int i=0;i<n;i++)
	{
		System.out.print(heap[i] +" ");
	}
	//----------sorted data[Heap sort]--------------
	int size=n;
	int temp;
	while(size!=1 )
	{
		temp=heap[1];
		heap[1]=heap[size];
		heap[size]=temp;
		size--;
		Heapify(heap,size);
	}
	System.out.println("\nSorted Heap");
	for(int i=0;i<n;i++)
	{
		System.out.print(heap[i] +" ");
	}
}

}
