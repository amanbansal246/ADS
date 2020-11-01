package ads.sorting;
public class Insertion_sort {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		int size=arr.length;

	
		
		for(int i=1;i<size;i++) //start from 1 bciz we assume till 0th we have sorted data
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
		//display sorted data
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}
