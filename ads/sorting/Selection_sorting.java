package ads.sorting;

public class Selection_sorting {

	public static void main(String[] args) {
	int arr[]= {5,4,3,2,1};
	int size=arr.length;
	int min;

	//iteration before sort
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	//selection sort
	//i is the place where we want smallest ele
			//min is the index of smallest index 
			//j is the index which is compare to min if a[j]<a[min] then min=j
			//when we found min ele the swap with a[i] and a[min]
	
	for(int i=0;i<size-1;i++) //run loop from 0th index to last-1 
	{
		min=i;
		for(int j=i+1;j<size;j++) //run from 1th to last 
		{
			if(arr[j]<arr[min])  
			{
				min=j;
			}
		}
		int temp=arr[min];  //bring smallest ele at first place
		arr[min]=arr[i];
		arr[i]=temp;
	}
	
	//iteration after sort
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	}

}

//https://www.youtube.com/watch?v=EU9FIt1t-Is&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=2