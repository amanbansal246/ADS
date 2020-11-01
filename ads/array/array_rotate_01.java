package ads.array;
public class array_rotate_01 {
	public static void rotate(int[] a,int d) //3n--> O(n)
	{
		d=d%a.length;
		
		reverse(a,0,d-1);  //O(n)
		reverse(a,d,a.length-1); //O(n)
		reverse(a,0,a.length-1); //O(n)
	}
	public static void reverse(int []a,int s,int e) //time com of reverse fun is O(n)
	{
		while(s<e)
		{
			int temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int d=2; //no of times rotations
		rotate(a,d); 
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

//time complexity is O(n) and space com is O(1)