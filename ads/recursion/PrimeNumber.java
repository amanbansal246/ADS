package ads.recursion;
public class PrimeNumber {
	public boolean prime(int n,int s,int e)
	{
		if(n%s==0)
			return false;
		else if(s>e)
			return true;
		return prime(n,s=s+1,e);
	}
	public static void main(String[] args) {
		PrimeNumber pm=new PrimeNumber();
		int n=10; //print first 10 prime number
		int i=2;
		int count=0;
		while(true)
		{
			if(pm.prime(i,2,i/2))
			{
				count++;
				System.out.print(i+" ");
				if(count==n) break;
			}
			i=i+1;
		}
	}

}
