package ads.recursion;

public class Number_Operation {
	public int countDigit(int n)
	{
		if(n<1) return 0;
		
		return 1+countDigit(n/10);
	}
	public int sumDigit(int n)
	{
		if(n<1) return 0;
		
		return n%10+sumDigit(n/10);
	}
	public int reverseNumber(int n,int rev)
	{
		if(n<1) return rev;
		
		return reverseNumber(n/10 ,(rev*10+n%10));
	}
	public static void main(String[] args) {
		Number_Operation cn=new Number_Operation();
		System.out.println(cn.countDigit(1234));  //count digit
		System.out.println(cn.sumDigit(1234)); //sum of digit 
		System.out.println(cn.reverseNumber(1234,0)); //reverse of number
	}

}
