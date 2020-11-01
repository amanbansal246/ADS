package ads.Matrix;
import java.util.Scanner;
public class Matrix_DiagonalTraversal {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter row size");
//		int r=sc.nextInt();
//		System.out.println("enter column size");
//		int c=sc.nextInt();
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int r=arr.length;
		int c=arr[0].length;
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		
		for(int col=0;col<c;col++)
		{
			int i=0,j=col;
			while(i<r && j<c)
			{
				System.out.print(arr[i][j]+" ");
				i++;
				j++;
			}
			System.out.println();
		}
		

	}

}
