package ads.Matrix;

public class Matrix_search_sorted_2d_array {

	public static void main(String[] args) {
		int a[][]= {{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45}};
		int n=44;
		
		int i=0; 
		int j=a[0].length-1;
		while(i<a.length && j>=0) 
		{
			if(n==a[i][j]) {
				System.out.println(i+" "+j);
				return;
			}else if(n<a[i][j])
			{
				j--;
			}else if(n>a[i][j])
			{
				i++;
			}
		}
		System.out.println("Not found");
	}

}
