package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_MazePathWithDiagnal {
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
		ArrayList<String> dpaths=new ArrayList<>();
		if(sc<dc)
		{
			hpaths=getPaths(sr,sc+1,dr,dc);
		}
		if(sr<dr)
		{
			vpaths=getPaths(sr+1,sc,dr,dc);
		}
		if(sr<dr && sc<dc)
		{
			dpaths=getPaths(sr+1,sc+1,dr,dc);
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
		for(String dpath:dpaths )
		{
			paths.add("d"+dpath);
		}
		return paths;
	}
	public static void main(String[] args) {
	ArrayList<String> paths=getPaths(1,1,3,3);
	for(String path:paths)
	{
		System.out.println(path);
	}
	}

}
