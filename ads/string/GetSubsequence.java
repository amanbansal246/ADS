package ads.string;

import java.util.ArrayList;

public class GetSubsequence { 
	public static ArrayList<String> getSeqenceByte(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> ss=new ArrayList<>();
			ss.add("");
			return ss;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> sub=getSeqenceByte(ros);
		
		ArrayList<String> subseq=new ArrayList<>();
		for(String s:sub)
		{
			subseq.add(s+"");
			subseq.add(s+ch);
		}
		return subseq;
	}
	public static void main(String args[])
	{
		ArrayList<String> paths= getSeqenceByte("abc");
		for(String path:paths)
		{
			System.out.println(path);
		}
	}
}
//https://www.youtube.com/watch?v=Sa5PmCFF_zI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=25