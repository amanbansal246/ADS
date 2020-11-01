package ads.array;

public class largest_ele_in_sorted_rotate03 {
	public static int searchLarge(int[] arr,int s,int h)
	{
		int m=(s+h)/2;
		if(arr[m]>arr[m-1] && arr[m]>arr[m+1])
		{
			return m;
		}
		if(arr[s]>arr[m])
			return searchLarge(arr,s,m);
		else
			return searchLarge(arr,m+1,h);
	}
	public static void main(String[] args) {
	int[] arr= {11,12,13,4,9,10};
	int idx=searchLarge(arr,0,arr.length-1);
	System.out.println(idx);
	}

}
