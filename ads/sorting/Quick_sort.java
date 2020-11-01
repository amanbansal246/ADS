package ads.sorting;

public class Quick_sort {
	public static void quickSort(int arr[],int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		
		int pivot=arr[hi];
		int pi=partioningArray(arr,lo,hi,pivot);
		quickSort(arr,lo,pi-1);
		quickSort(arr,pi+1,hi);
	}
	public static int partioningArray(int a[],int lo,int hi,int pivot)
	{
		int i=lo;
		int j=lo;
		while(i<=hi)
		{
			if(a[i]<=pivot)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				i++;
				j++;
			}else {
				i++;
			}
		}
		return j-1;
	}
	public static void main(String[] args) {
		int a[]= {7,9,4,8,5,3,6,2,1};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
//https://www.youtube.com/watch?v=kdO5Q0nmPjU&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=7