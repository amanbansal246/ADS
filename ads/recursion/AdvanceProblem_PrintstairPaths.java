package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_PrintstairPaths {
	public static void getPaths(int n,String path)
	{
		if(n==0)
		{
			System.out.println(path);
			return;
		}
		if(n<0) 
		{
			return;
		}
		getPaths(n-1,1+path);
		getPaths(n-2,2+path);
		getPaths(n-3,3+path);
	}
	public static void main(String[] args) {
		getPaths(4,"");
		
	}

}
//https://www.youtube.com/watch?v=NEuYcztalew&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=37