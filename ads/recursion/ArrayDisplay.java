package ads.recursion;

public class ArrayDisplay {
	public void arrShow(int a[],int idx)
	{
		if(idx==a.length)
			return;
		System.out.println(a[idx]+" ");
		arrShow(a,idx=idx+1);
	}
	public void arrReverseShow(int a[],int idx)
	{
		if(idx==a.length)
			return;
		
		arrReverseShow(a,idx+1);
		System.out.println(a[idx]+" ");
	}
	public int max(int a[],int idx)
	{
		if(idx==a.length-1) return a[idx];
		int misa=max(a,idx+1);
		if(misa>a[idx])
			return misa;
		else
			return a[idx];
	}
	public int min(int a[],int idx)
	{
		if(idx==a.length-1) return a[idx];
		int misa=min(a,idx+1);
		if(misa<a[idx])
			return misa;
		else
			return a[idx];
	}
	//first occurance
	public int firstOccurance(int a[],int data,int idx)
	{
		if(idx==a.length) return -1;
		if(a[idx]==data)
			return idx;
		else 
			return firstOccurance(a,data,idx+1);
	}
	//last occurance
	public int lastOccurance(int a[],int data,int idx)
	{
		if(idx==-1) return -1;
		if(a[idx]==data)
			return idx;
		else 
			return lastOccurance(a,data,idx-1);
	}
	public static void main(String[] args) {
		ArrayDisplay ar=new ArrayDisplay();
		int a[]= {2,4,6,3,8,5,3,8,0,6,4};
		ar.arrReverseShow(a, 0);
		System.out.println(ar.max(a, 0));
		System.out.println(ar.min(a, 0));
		System.out.println("First occurance "+ar.firstOccurance(a,8,0));
		System.out.println("Last occurance "+ar.lastOccurance(a,8,a.length-1));
	}

}
