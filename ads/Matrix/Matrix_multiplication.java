package ads.Matrix;
import java.util.Scanner;
public class Matrix_multiplication {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("row of arr1");
		int r1=sc.nextInt();
		System.out.println("column of arr2");
		int c1=sc.nextInt();
		int[][] arr1=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("row of arr2");
		int r2=sc.nextInt();
		System.out.println("col of arr2");
		int c2=sc.nextInt();
		int[][] arr2=new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		if(c1!=r2)
		{
			System.out.println("Invalid Input");
			return;
		}
		int arr3[][]=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
			}
		}
	
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}	
	}

}
