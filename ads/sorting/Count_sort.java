package ads.sorting;

public class Count_sort {
	public static void countSort(int arr[],int min,int max)
	{
		//{9,6,3,5,3,4,3,9,6,4,6,5,8,9,9}
		int range=max-min+1;
		int[] farr=new int[range];
		
		//{3,2,2,3,0,1,4}
		for(int i=0;i<arr.length;i++)
		{
			int idx=arr[i]-min;
			farr[idx]++;
		}
		
		//{3,5,7,10,10,15}
		for(int i=1;i<farr.length;i++)
		{
			farr[i]=farr[i]+farr[i-1];
		}
		
		
		int[] ans=new int[arr.length];
		
		//{3,3,3,4,4,5,5,6,6,6,8,9,9,9,9}
		for(int i=ans.length-1;i>=0;i--)
		{
			int val=arr[i];
			int pos=farr[val-min];
			int idx=pos-1;
			ans[idx]=val;
			 farr[val-min]--;
		}
		
		for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
	public static void main(String[] args) {
		int[] arr= {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
		int min=3;
		int max=9;
		countSort(arr,min,max);
	}

}
