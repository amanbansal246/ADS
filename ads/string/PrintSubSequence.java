package ads.string;

public class PrintSubSequence {
	public static void printSubsequence(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch=s.charAt(0);
		String ss=s.substring(1);
		
		printSubsequence(ss,ans+"");
		printSubsequence(ss,ans+ch);
	}
	public static void main(String[] args) {
		printSubsequence("abc","");

	}

}
