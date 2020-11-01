package ads.sorting;

public class Alternative_sort {
	public static int [] mergeSort(int a[],int s,int h)
	{
		if(s==h)
			return a[s];
		int m=(s+h)/2;
		int lft=mergeSort(a,s,m);
		int rht=mergeSort(a,m+1,h);
		return merge(lft,rht);
	}
	public static int[] merge(int[] lft,int[] rht)
	{
		
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		
		//first sort in nlogn complexity(merge sort)

	}

}
