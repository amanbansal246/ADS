package ads.Matrix;
import java.util.Scanner;
public class Matrix_ExitPoint {
	public static void main(String[] args) 
	{
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
		
		int i=0;
		int j=0;
		int dir=0; //0->east 1->south 2->west 3->north
		while(true)
		{
			dir=(dir+arr[i][j])%c;
			if(dir==0) {
				j++;
			}else if(dir==1) {
				i++;
			}else if(dir==2) {
				j--;
			}else if(dir==3) {
				i--;
			}
			
			if(i<0) {
				i++;
				break;
			}else if(j<0) {
				j++;
				break;
			}else if(i==arr.length) {
				i--;
				break;
			}else if(j==arr[0].length) {
				j--;
				break;
			}
		}//while end
		
		System.out.println(i+" "+j);
		
	}//main end

}
//https://www.youtube.com/watch?v=FUBlb360kqU&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=9