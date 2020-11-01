package ads.sorting;

public class Merge_sort {
	//break array in two parts
	public static int[] mergeSort(int a[],int st,int hi)
	{
		if(st==hi)
		{
			int[] ba=new int[1];
			ba[0]=a[st];
			return ba;
		}
		
		int mid=(st+hi)/2;
		int ls[]=mergeSort(a,st,mid);
		int rs[]=mergeSort(a,mid+1,hi);
		int s[]=mergeTwoSortedArray(ls,rs);
		return s;
	}
	//merger two arrays
	public static int[] mergeTwoSortedArray(int la[],int ra[])
	{
		int i=0,k=0,j=0;
		int []res=new int[la.length + ra.length];
		while(i<la.length && j<ra.length)
		{
			if(la[i]<ra[j])
			{
				res[k++]=la[i++];
			}else
			{
				res[k++]=ra[j++];
			}
		}
		while(i<la.length)
		{
			res[k++]=la[i++];
		}
		while(j<ra.length)
		{
			res[k++]=ra[j++];
		}
		return res;
	}
	public static void main(String[] args) {
		int a[]= {23,5,34,11,8,45,99};
		int r[]=mergeSort(a,0,a.length-1);
		
		for(int i=0;i<r.length;i++)
			System.out.print(r[i]+" ");
	}

}
//https://www.youtube.com/watch?v=aiUHB-3EOg8&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=5