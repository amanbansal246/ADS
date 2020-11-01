package ads.sorting;

public class Radix_sort {
	public static void radixSort(int arr[],int exp)
	{
		int farr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			int idx=arr[i]/exp%10;
			farr[idx]++;
		}
		
		for(int i=1;i<farr.length;i++)
		{
			farr[i]=farr[i]+farr[i-1];
		}
		
		int ans[]=new int[arr.length];
		
		
		for(int i=ans.length-1;i>=0;i--)
		{
			int val=arr[i]/exp%10;
			int pos=farr[val]-1;
			ans[pos]=arr[i];
			farr[val]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ans[i];
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr= {213,97,718,123,37,443,987,64,375,683};
		int max=Integer.MIN_VALUE;

		for(int i:arr)
		{
			
			if(i>max)
				max=i;
		}
		int exp=1;
		while(exp<max)
		{
			radixSort(arr,exp);
			exp=exp*10;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
//https://www.youtube.com/watch?v=a5e7RgCdel0&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=10