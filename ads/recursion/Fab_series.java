package ads.recursion;

public class Fab_series {
	public int fabSeries(int n)
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		
		return fabSeries(n-1)+fabSeries(n-2);
	}
	
	public static void main(String[] args) {
		Fab_series fab=new Fab_series();
		for(int i=1;i<=10;i++)	
			System.out.print(fab.fabSeries(i)+ " ");
		
	}

}
