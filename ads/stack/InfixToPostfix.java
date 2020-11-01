package ads.stack;
import java.util.Stack;
public class InfixToPostfix {
	public int precednece(char ch)
	{
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':	
		case '/':
		case '%':
			return 2;
		default:
			return -1;
		}
	}
	public String convertPostfix(String infix)
	{
		Stack<Character> st=new Stack<Character>();
		String output="";
		char temp;
		for(int i=0;i<infix.length();i++)
		{
			temp=infix.charAt(i);
			if(Character.isLetterOrDigit(temp)) {
				output+=temp;
			}else if(temp=='(')
					st.push(temp);
			else if(temp==')') {
				while(!st.empty() && st.peek()!='(') {
					output+=st.pop();
				}
				if(st.empty())
					return "expression is invalid";
				else
					st.pop();
			}
			else {
				while(!st.empty() && precednece(temp)<=precednece(st.peek()) ) {
					output+=st.pop();
				}
				st.push(temp);
			}
		}
		while(!st.empty())
			output+=st.pop();
		return output;
		
	}
	public static void main(String[] args)
	{
		InfixToPostfix ip=new InfixToPostfix();
		String infix="a*(b+c)-d/(e+f)";
		String postfix="";
		postfix=ip.convertPostfix(infix);
		System.out.println(postfix);
	}

}
//https://www.youtube.com/watch?v=2a7C_pQmbyU --for explanation