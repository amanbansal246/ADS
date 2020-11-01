package ads.sorting;

public class Merge_Two_sorted_array {

	public static void main(String[] args) {
		int[] a= {2,5,12,18,20};
		int[] b= {7,9,11,15,25,28,30,35};
		
		int[] c=new int[a.length+b.length];
		int i=0,k=0,j=0;
		
	
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		
		//insert remaining ele of a array
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		//insert remainin ele of b array
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		
		//display sorted merge data
		for(int h=0;h<c.length;h++)
			System.out.print(c[h]+" ");
	}

}
//https://www.youtube.com/watch?v=WMxNhIBA92I&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=4