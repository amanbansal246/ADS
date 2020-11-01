package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_GetstairPaths {
	public static ArrayList<String> getPaths(int n)
	{
		if(n==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		if(n<0)
		{
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		ArrayList<String> path1=getPaths(n-1);
		ArrayList<String> path2=getPaths(n-2);
		ArrayList<String> path3=getPaths(n-3);
		ArrayList<String> paths=new ArrayList<>();
		for(String path:path1)
		{
			paths.add(path);
		}
		for(String path:path2)
		{
			paths.add(path);
		}
		for(String path:path3)
		{
			paths.add(path);
		}
		return paths;
	}
}
//https://www.youtube.com/watch?v=hMJAlbJIS7E&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=29