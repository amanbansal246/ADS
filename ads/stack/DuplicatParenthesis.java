package ads.stack;

import java.util.Stack;

public class DuplicatParenthesis {

	public void checkDuplicate(String exp)
	{
		if(exp.length()<=3)
			return;
		
		Stack<Character> st=new Stack<Character>();
		char[] ex=exp.toCharArray();
		for(char ch:ex)
		{
			if((ch!=')') )
				st.push(ch);
			else {
				if((st.peek()=='('))
				{
					System.out.println("Expression have duplicate parenthesis");
					return;
				}else {
					while(st.peek()!='(')
						 st.pop();
					st.pop();
				}
			}
		}
		System.out.println("Expression does not have duplicate parenthesis");
	}
	public static void main(String[] args) {
		 String exp="(((x))+y)";
		 DuplicatParenthesis bs=new DuplicatParenthesis();
		 bs.checkDuplicate(exp);
	}
}
