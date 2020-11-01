package ads.map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Higest_Frequency_character {
	public static void main(String[] args) {
		String str="kdsjflkjdsflkjdflkjdsflkjdfhdsfk";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				int r=hm.get(str.charAt(i));
				hm.put(str.charAt(i),r+1);
			}else {
				hm.put(str.charAt(i),1);
			}
		}
		int mf=hm.get(str.charAt(0));
		char mfc=str.charAt(0);
		for(Character key:hm.keySet())
		{
			if(hm.get(key)>mf)
			{
				mf=hm.get(key);
				mfc=key;
			}
		}
		
		System.out.println("Max frq char is "+mfc+" and frq is "+mf );
		
	}

}
