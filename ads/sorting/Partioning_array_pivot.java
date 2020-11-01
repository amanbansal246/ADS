package ads.sorting;

public class Partioning_array_pivot {

	public static void main(String[] args) {
		int a[]= {7,9,4,8,3,6,2,1};
		int size=a.length;
		int i=0;
		int j=0;
		int p=5;
		/*
		 * 0 to j-1 -> less than pivot
		 * j to i-1 -> greater than pivot
		 * i to end -> unknown
		 */
		while(i!=a.length)
		{
			if(a[i]>p)
				i++;
			if(a[i]<=p)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				j++;
				i++;
			}	
		}
		for(int l =0;l<size;l++)
			System.out.print(a[l]+" ");
	}
}
//application of partioning_array
// seperate all less then pivot ele and greater than element
//seperate all even and odd element
//seperate 0 and 1
//saperate 0 and non zero element



//https://www.youtube.com/watch?v=if40LxQ8_Xo&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=6