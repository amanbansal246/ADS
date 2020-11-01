package ads.recursion;

public class StringOperation {
//	public void reverse(String st)
//	{
//		int l=st.length();
//		String str="";
//		for(int i=l-1;i>=0;i--)
//		{
//			str=str+st.charAt(i);
//		}
//		System.out.println(str);
//	}
	public String reverse1(String st,int index,int length,String str)
	{
		if(index<0) return str;
		
		str=str+st.charAt(index);
		return  reverse1(st,index=index-1,length,str);
	}
	public static void main(String[] args) {
	StringOperation st=new StringOperation();
	String s1="amanbansal";
	//st.reverse(s1);
	int length=s1.length();
	System.out.println(st.reverse1(s1, length-1, length, ""));
	
	}

}
