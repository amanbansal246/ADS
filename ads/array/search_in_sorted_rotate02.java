package ads.array;

public class search_in_sorted_rotate02 {
	public static int search(int[] a,int s,int h,int val)
	{
		int mid=(s+h)/2;
		if(a[mid]==val) return mid;
		
		if(a[s]<=a[mid])
		{
			if(val>=a[s] && val<=a[mid])
			{
				return search(a,s,mid,val);
			}else {
				return search(a,mid+1,h,val);
			}
		}
		else{
			if(val>=a[mid+1] && val<=a[h])
			{
				return search(a,mid+1,h,val);
			}else {
				return search(a,s,mid,val);
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,1,2};
		int idx=search(a,0,a.length-1,4);
		System.out.println(idx);
	}

}
