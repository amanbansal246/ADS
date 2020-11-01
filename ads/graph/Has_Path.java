package ads.graph;
import java.io.*;
import java.util.*;
public class Has_Path {
	static class Edge
	{
		int src;  //source
		int nbr;  //neighbour
		int wt;  //weight
		Edge(int src,int nbr,int wt)
		{
			this.src=src;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int vtces =Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph=new ArrayList[vtces];  //array of arraylist type
		for(int i=0;i<vtces;i++)
		{
			graph[i] = new ArrayList<>();
		}
		int edges=Integer.parseInt(br.readLine()); //numer of edges
		
		
		
	}

}
