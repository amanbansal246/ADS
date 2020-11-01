package ads.string;

public class PrintPermutations {
	public static void printPermutations(String str,String ans)
	{
		if(str.length()==1)
		{
			System.out.println(str+ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String lstring=str.substring(0, i);
			String rstring=str.substring(i+1);
			printPermutations(lstring+rstring,ch+ans);
		}
	}
	public static void main(String[] args) {
		printPermutations("abc","");

	}

}
//https://www.youtube.com/watch?v=sPAT_DbvDj0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=43