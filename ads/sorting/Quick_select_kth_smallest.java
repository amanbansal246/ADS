package ads.sorting;

public class Quick_select_kth_smallest {
	public static void quickSort(int arr[],int lo,int hi,int k)
	{
		if(lo>=hi)
		{
			return;
		}
		
		int pivot=arr[hi];
		int pi=partioningArray(arr,lo,hi,pivot);
		if(pi==k)
		{
			System.out.print(arr[k]+"\n");
			return;
		}
		else if(k<pi) {
			quickSort(arr,lo,pi-1,k);
		}else {
			quickSort(arr,pi+1,hi,k);
		}
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
		int k=4;
		quickSort(a,0,a.length-1,k);
	}
}
