package ads.array;

public class rotation_count05 {
	public static int largeEle(int a[],int s,int e)
	{
		int m=(s+e)/2;
		if(a[m]>a[m-1] && a[m]>a[m+1])
			return m;
		if(a[s]>a[m])
			return largeEle(a,s,m);
		else
			return largeEle(a,m+1,e);
	}
	public static void main(String[] args) {
		int[] a= {15, 18, 22, 3, 6, 12};
		int idx=largeEle(a,0,a.length-1);
		
		System.out.println("no of rotations are "+(idx+1));
	}

}
