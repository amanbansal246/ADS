package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_MazePathWithJump {
	public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
//		if(sr>dr || sc>dc)
//		{
//			ArrayList<String> br=new ArrayList<>();
//			return br;
//		}
		ArrayList<String> hpaths1=new ArrayList<>();
		ArrayList<String> hpaths2=new ArrayList<>();
		ArrayList<String> hpaths3=new ArrayList<>();
		ArrayList<String> vpaths=new ArrayList<>();
		ArrayList<String> vpaths1=new ArrayList<>();
		ArrayList<String> vpaths2=new ArrayList<>();
		ArrayList<String> vpaths3=new ArrayList<>();
		if(sc<dc)
		{
			hpaths1=getPaths(sr,sc+1,dr,dc);
			hpaths2=getPaths(sr,sc+2,dr,dc);
			hpaths3=getPaths(sr,sc+3,dr,dc);
		}
		if(sr<dr)
		{
			vpaths1=getPaths(sr+1,sc,dr,dc);
			vpaths2=getPaths(sr+2,sc,dr,dc);
			vpaths3=getPaths(sr+3,sc,dr,dc);
		}
		ArrayList<String> paths=new ArrayList<>();
		for(String path:hpaths1)
		{
			paths.add("h1"+path);
		}
		for(String path:hpaths2)
		{
			paths.add("h2"+path);
		}
		for(String path:hpaths3)
		{
			paths.add("h3"+path);
		}
		for(String path:vpaths1)
		{
			paths.add("v1"+path);
		}
		for(String path:vpaths2)
		{
			paths.add("v2"+path);
		}
		for(String path:vpaths3)
		{
			paths.add("v3"+path);
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
//https://www.youtube.com/watch?v=VaGBRiSdtFI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=33