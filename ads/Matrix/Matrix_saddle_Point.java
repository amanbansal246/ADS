package ads.Matrix;

public class Matrix_saddle_Point {

	public static void main(String[] args) {
		int[][] arr= {{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45}};
		for(int i=0;i<arr.length;i++)
		{
			int min=0;
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]<arr[i][min])
					min=j;
			}
			
			boolean flag=true;
			for(int k=0;k<arr[0].length;k++)
			{
				if(arr[k][min]>arr[i][min])
					flag=false;
					break;
			}
			if(flag==true)
			{
				System.out.print("Saddle point is "+arr[i][min]);
				break;
			}
		}
		
	}

}
