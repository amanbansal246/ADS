package ads.recursion;

public class Power {
	public int pow(int b,int p)
	{
		if(p==0)
			return 1; 
		if(p%2!=0)
			return b*pow(b,p/2)*pow(b,p/2);
		else
			return pow(b,p/2)*pow(b,p/2);
	}
	public static void main(String[] args) {
		Power p=new Power();
		int base=2,power=5;
		System.out.println(p.pow(base,power));
	}

}
