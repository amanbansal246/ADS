package ads.recursion;


public class AdvanceProblem_N_Queens {
	public static void printNQueens(int arr[][],String psf,int row)
	{
		if(row==arr.length)
		{
			System.out.println(psf);
			return;
		}
		for(int col=0;col<arr.length;col++)
		{
			if(isItIsaSafePlace(arr,row,col)==true)
			{
				arr[row][col]=1;
				printNQueens(arr,psf+row+"-"+col+",",row+1);
				arr[row][col]=0;
			}
		}
	}
	public static boolean isItIsaSafePlace(int arr[][],int row,int col)
	{
		for(int r=row-1;r>=0;r--)
		{
			if(arr[r][col]==1)return false;
		}
		for(int r=row-1,c=col-1;r>=0 && c>=0;r--,c--)
		{
			if(arr[r][c]==1)return false;
		}	
		for(int r=row-1,c=col+1;r>=0 && c<arr.length;r--,c++)
		{
			if(arr[r][c]==1)return false;
		}	
		return true;
	}
	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		printNQueens(arr,"",0);

	}

}
