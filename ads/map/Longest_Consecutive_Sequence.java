package ads.map;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		int arr[]= {10,5,9,1,11,8,6,15,3,12,2};
		HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
		for(Integer i:arr)
		{
			hm.put(i,true);
		}
		for(int i:arr)
		{
			if(hm.containsKey(i-1)==true)
			{
				hm.put(i,false);
			}
		}
		for(Integer i:hm.keySet())
		{
			if(hm.get(i)==true)
			{
				int s=i;
				while(hm.containsKey(s)==true)
				{
					System.out.print(s+" ");
					s+=1;
				}
				System.out.println();
			}
		}
	}

}
