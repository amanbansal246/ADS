package ads.sorting;

public class Sort_012 {
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,2,0,1,2,2,1,0,1,2,0,2,1};
		
		int i=0;
		int j=0;
		int k=arr.length-1;
		
		while(i<=k)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j++;
			}else if(arr[i]==1)
			{
				i++;
			}else {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				
				k--;
			}
		}
		
		for(int t:arr)
		{
			System.out.print(t+" ");
		}
	}
}
//https://www.youtube.com/watch?v=MbV26HWqxrs&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=13