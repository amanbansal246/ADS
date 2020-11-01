package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_MazePath {
	public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> hpaths=new ArrayList<>();
		ArrayList<String> vpaths=new ArrayList<>();
		if(sc<dc)
		{
			hpaths=getPaths(sr,sc+1,dr,dc);
		}
		if(sr<dr)
		{
			vpaths=getPaths(sr+1,sc,dr,dc);
		}
		ArrayList<String> paths=new ArrayList<>();
		for(String hpath:hpaths )
		{
			paths.add("h"+hpath);
		}
		for(String vpath:vpaths )
		{
			paths.add("v"+vpath);
		}
		return paths;
	}
	public static void main(String[] args) {
		ArrayList<String> paths=getPaths(1,1,3,3);
		for(String i:paths)
		{
			System.out.println(i);
		}
	}

}
//https://www.youtube.com/watch?v=7i41gZLXe5k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=31