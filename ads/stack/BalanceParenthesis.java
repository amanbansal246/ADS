package ads.stack;
import java.util.Stack;
public class BalanceParenthesis {

	public boolean checkExp(String exp)
	{
		if(exp.length()==1)
			return false;
		
		Stack<Character> st=new Stack<Character>();
		char[] ex=exp.toCharArray();
		for(char ch:ex)
		{
			if((ch=='(') || (ch=='{') || (ch=='[') )
				st.push(ch);
			else {
				if(st.empty())
					return false;
				
				char temp=st.peek();
				st.pop();
				
				if((temp=='(' && ch!=')') || (temp=='{' && ch!='}') || (temp=='[' && ch!=']') )
					return false;
			}
		}
		return st.empty();
	}
	public static void main(String[] args) {
		 String exp="{()}[{}]";
		 BalanceParenthesis bs=new BalanceParenthesis();
		 if(bs.checkExp(exp))
			 System.out.println("yes!");
		 else
			 System.out.println("No");
	}

}
