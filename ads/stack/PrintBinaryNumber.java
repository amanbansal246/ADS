package ads.stack;
import java.util.Stack;
public class PrintBinaryNumber {
	public void getBinary(int no)
	{
		Stack<Integer> st=new Stack<>();
		int r;
		while(no>0) {
			r=no%2;
			st.push(r);
			no=no/2;
		}
		while(!st.empty())
			System.out.print(st.pop());
		System.out.println();
	}
	public static void main(String[] args) {
		PrintBinaryNumber pn=new PrintBinaryNumber();
		for(int i=1;i<=10;i++) {
			pn.getBinary(i);
		}

	}

}
