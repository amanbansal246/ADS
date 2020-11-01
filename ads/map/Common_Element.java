package ads.map;

import java.util.HashMap;

public class Common_Element {

	public static void main(String[] args) {
		String str1="1122235";
		String str2="1112245";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++)
		{
			Character ch=str1.charAt(i);
			if(hm.containsKey(ch))
			{
				int of=hm.get(ch);
				hm.put(ch,of+1);
			}else {
				hm.put(ch,1);
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			Character ch=str2.charAt(i);
			if(hm.containsKey(ch))
			{
				if(!(hm.get(ch)<=0))
				{
					System.out.print(ch+" ");
					int of=hm.get(ch);
					hm.put(ch,of-1);
				}
			}
		}

		

	}

}
