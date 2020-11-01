package ads.array;

public class pair_with_given_sum04 {
	public static boolean checkSum(int a[],int sum)
	{
		int l=largeEle(a,0,a.length-1); //largeEle
		int s=l+1;//smallest ele
		while(s!=l)
		{
			if(a[s]+a[l]==sum)
				return true;
			if(a[s]+a[l]>sum)
				l = (l - 1 + a.length) % a.length;
			else
				s = (s + 1) % a.length;
			
			
		}
		return false;
	}
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
		int a[]= {11, 15, 6, 8, 9, 10};
		int sum=21;
		boolean ans=checkSum(a,sum);
		System.out.println(ans);
	}

}
