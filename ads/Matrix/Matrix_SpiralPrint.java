package ads.Matrix;

public class Matrix_SpiralPrint {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4,5,6,7},{11,12,13,14,15,16,17},{21,22,23,24,25,26,27},{31,32,33,34,35,36,37}
						,{41,42,43,44,45,46,47},{51,52,53,54,55,56,57}};
		int row=arr.length;
		int col=arr[0].length;
		int tel=row*col;
		int count=0;
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int i,j;
		while(count<tel)
		{
			//left wall
			for(i=minr,j=minc;i<=maxr && count<tel;i++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			//buttom wall
			for(j=minc,i=maxr;j<=maxc && count<tel;j++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			//right wall
			for(i=maxr,j=maxc;i>=minr && count<tel;i--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			//up wall
			for(i=minr,j=maxc;j>=minc && count<tel;j--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
	}

}
