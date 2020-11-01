package ads.recursion;

public class MaxElementInArray {
	public int findMax(int a[],int length,int index,int max)
	{
		if(index==length) return max;
		
		if(a[index]>max)
			max=a[index];
		
		return findMax(a,length,index=index+1,max);
	}
	public static void main(String[] args) {
		MaxElementInArray m=new MaxElementInArray();
		int a[]= {21,22,3,2,44,2,323,7,34,12};
		int max=m.findMax(a,a.length,0,Integer.MIN_VALUE);
		System.out.println(max);
	}

}
