package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_MazePathWithDiagnal_Jump {
//	public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc)
//	{
//		if(sr==dr && sc==dc)
//		{
//			ArrayList<String> br=new ArrayList<>();
//			br.add("");
//			return br;
//		}
//		ArrayList<String> hpaths1=new ArrayList<>();
//		ArrayList<String> hpaths2=new ArrayList<>();
//		ArrayList<String> hpaths3=new ArrayList<>();
//		
//		ArrayList<String> vpaths1=new ArrayList<>();
//		ArrayList<String> vpaths2=new ArrayList<>();
//		ArrayList<String> vpaths3=new ArrayList<>();
//		
//		ArrayList<String> dpaths1=new ArrayList<>();
//		ArrayList<String> dpaths2=new ArrayList<>();
//		ArrayList<String> dpaths3=new ArrayList<>();
//		
//		ArrayList<String> paths=new ArrayList<>();
//		if(sc<dc)
//		{
//			hpaths1=getPaths(sr,sc+1,dr,dc);
//			hpaths2=getPaths(sr,sc+2,dr,dc);
//			hpaths3=getPaths(sr,sc+3,dr,dc);
//		}
//		if(sr<dr)
//		{
//			vpaths1=getPaths(sr+1,sc,dr,dc);
//			vpaths2=getPaths(sr+2,sc,dr,dc);
//			vpaths3=getPaths(sr+3,sc,dr,dc);
//		}
//		if(sr<dr && sc<dc)
//		{
//			dpaths1=getPaths(sr+1,sc+1,dr,dc);
//			dpaths2=getPaths(sr+2,sc+2,dr,dc);
//			dpaths3=getPaths(sr+3,sc+3,dr,dc);
//		}
//
//		for(String hpath:hpaths1 )
//		{
//			paths.add("h1"+hpath);
//		}
//		for(String hpath:hpaths2 )
//		{
//			paths.add("h2"+hpath);
//		}
//		for(String hpath:hpaths3 )
//		{
//			paths.add("h3"+hpath);
//		}
//		
//		
//		for(String vpath:vpaths1 )
//		{
//			paths.add("v1"+vpath);
//		}
//		for(String vpath:vpaths2 )
//		{
//			paths.add("v2"+vpath);
//		}
//		for(String vpath:vpaths3 )
//		{
//			paths.add("v3"+vpath);
//		}
//		
//		for(String dpath:dpaths1 )
//		{
//			paths.add("d1"+dpath);
//		}
//		for(String dpath:dpaths2 )
//		{
//			paths.add("d2"+dpath);
//		}
//		for(String dpath:dpaths3 )
//		{
//			paths.add("d3"+dpath);
//		}
//		
//		return paths;
//	}
	public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		ArrayList<String> paths=new ArrayList<>(); 
		//horizontal moves
		for(int ms=1;ms<=(dc-sc);ms++)
		{
			ArrayList<String> hpaths=getPaths(sr,sc+ms,dr,dc);
			for(String path:hpaths)
			{
				paths.add("h"+ms+path);
			}
		}
		
		//vertical moves
		for(int ms=1;ms<=(dr-sr);ms++)
		{
			ArrayList<String> vpaths=getPaths(sr+ms,sc,dr,dc);
			for(String path:vpaths)
			{
				paths.add("v"+ms+path);
			}
		}
		
		//diagonal moves
		for(int ms=1;ms<=(dr-sr) && ms<=(dc-sc);ms++)
		{
			ArrayList<String> dpaths=getPaths(sr+ms,sc+ms,dr,dc);
			for(String path:dpaths)
			{
				paths.add("d"+ms+path);
			}
		}
		
		return paths;
	}
	public static void main(String[] args) {
	AdvanceProblem_MazePathWithDiagnal_Jump am=new AdvanceProblem_MazePathWithDiagnal_Jump();
	ArrayList<String> paths=am.getPaths(1,1,3,3);
	int count=0;
	for(String path:paths)
	{
		count++;
		System.out.println(path);
	}
	System.out.println("Tota path are "+count);
	}
}
//https://www.youtube.com/watch?v=VaGBRiSdtFI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=33