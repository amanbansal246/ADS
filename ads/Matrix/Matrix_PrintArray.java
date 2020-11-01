package ads.Matrix;
import java.util.Scanner;
public class Matrix_PrintArray {
	public static void printArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of rows");
	int r=sc.nextInt();
	System.out.println("Enter no of colums");
	int c=sc.nextInt();
	int arr[][]=new int[r][c];
	System.out.println("Enter elements");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	printArray(arr);
	}

}
