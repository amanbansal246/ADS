package ads.recursion;

public class AdvanceProblem_PrintMazePath {
	public static void getPaths(int sr,int sc,int dr,int dc,String path)
	{
		if(sr==dr && sc==dc)
		{
			System.out.println(path);
			return;
		}

		if(sc<=dc)
		{
			getPaths(sr,sc+1,dr,dc,"h"+path);
		}
		if(sr<=dr)
		{
			getPaths(sr+1,sc,dr,dc,"v"+path);
		}
		
	}
	public static void main(String[] args) {
		getPaths(1,1,3,3,"");
		
	}
}
//https://www.youtube.com/watch?v=MHtAA5UE-6Y&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=39