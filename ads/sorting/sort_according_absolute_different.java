package ads.sorting;

import java.util.SortedMap;
import java.util.TreeMap;

public class sort_according_absolute_different {

	public static void main(String[] args) {
		int arr[]= {10, 5, 3, 9, 2};
		int x=7;
		SortedMap<Integer,Boolean> sm=new TreeMap<Integer,Boolean>();
		for(int i:arr)
		{
			int val=i-x;
			if(val<0)
			{
				sm.put(Math.abs(val),true);
			}else {
				sm.put(val,false);
			}
		}
		
		for(int i:sm.keySet())
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i:sm.keySet())
		{
			boolean v=sm.get(i);
			if(v==false)
				System.out.print(x-i+" ");
			else
				System.out.print(x+i+" ");
		}
		
		

	}

}
