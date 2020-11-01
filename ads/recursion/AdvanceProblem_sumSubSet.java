package ads.recursion;

import java.util.ArrayList;

public class AdvanceProblem_sumSubSet {
	public static void sumSubset(int[] arr,int idx,String set,int sos,int tar )
	{
		if(sos==tar)
		{
			System.out.println(set);
			return;
		}
		if(sos>tar) return;
		if(idx==arr.length) return;
		sumSubset(arr,idx+1,arr[idx]+set,sos+arr[idx],tar);
		sumSubset(arr , idx+1 ,set , sos , tar );
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		sumSubset(arr,0,"",0,70);

	}

}

//https://www.youtube.com/watch?v=HGDmj5NrrjM&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=49
