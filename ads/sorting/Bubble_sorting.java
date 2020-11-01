package ads.sorting;

public class Bubble_sorting {

	public static void main(String[] args) {
		int arr[]= {5,17,19,11,13,15};
		//int arr[]= {1,2,3,4,5,6,7};
		int size=arr.length;
		
		//iteration before sorting
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		
		//sorting logic
		for(int i=1;i<size;i++)  //first loop will run n-1 times , n is no of term in array
		{
			for(int j=0;j<size-i;j++)   //search largest ele and place at last
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//iteration after sorting
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}
//time complexity O(n) O(n^2) O(n^2)  
//space complecity O(1)
//https://www.youtube.com/watch?v=Jv-eGC2xmtU&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=1