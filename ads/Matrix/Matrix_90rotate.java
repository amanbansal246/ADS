package ads.Matrix;
import java.util.Scanner;
public class Matrix_90rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int r=sc.nextInt();
		System.out.println("enter column size");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//transport matrix
		for(int i=0;i<r;i++)
		{
			for(int j=i;j<c;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//reverse column
		for(int i=0;i<r;i++)
		{
			int min=0;
			int max=arr[0].length-1;
			while(min<max)
			{
				int temp=arr[i][min];
				arr[i][min]=arr[i][max];
				arr[i][max]=temp;
				min++;
				max--;
			}
		}

		
		
		//display matrix
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
