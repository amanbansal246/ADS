package ads.recursion;

import java.util.ArrayList;

public class Z_practics {
	public static void printPermutations(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		String s=str.substring(1);
		printPermutations(s,ans+ch);
		
	}
	public static void main(String[] args) {
		printPermutations("abc","");
	}

}
