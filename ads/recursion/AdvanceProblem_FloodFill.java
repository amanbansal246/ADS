package ads.recursion;
import java.util.Scanner;
public class AdvanceProblem_FloodFill {
	public static void getPath(int maze[][],int sr,int sc,String psf,boolean[][] visited)
	{
		if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1
				||visited[sr][sc]==true)
			return;
		
		if(sr==maze.length-1 && sc==maze[0].length-1)
		{
			System.out.println(psf);
			return;
		}
		visited[sr][sc]=true;
		getPath(maze,sr-1,sc,psf+"t",visited);
		getPath(maze,sr,sc-1,psf+"l;",visited);
		getPath(maze,sr+1,sc,psf+"d",visited);
		getPath(maze,sr,sc+1,psf+"r",visited);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int n=sc.nextInt();
		System.out.println("Enter column");
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		System.out.println("enter values");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();	
			}
		}
		boolean[][] visited=new boolean[n][m];
		System.out.println("ans");
		getPath(arr,0,0,"",visited);
		
		
	}

}

//https://www.youtube.com/watch?v=R1URUB6_y2k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=47