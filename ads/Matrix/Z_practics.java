package ads.Matrix;

public class Z_practics {

	public static void main(String[] args) {
		int arr[][]= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int min=0,max=arr[0].length-1;
			while(min<max)
			{
				int temp=arr[i][min];
				arr[i][min]=arr[i][max];
				arr[i][max]=temp;
				min++;
				max--;
			}
		}
 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
