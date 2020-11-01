package ads.dynamicProgramming;
import java.util.Scanner;
public class UglyNumber {
	public static boolean isUgly(int i)
	{
		while(i%2==0)
			i=i/2;
		while(i%3==0)
			i=i/3;
		while(i%5==0)
			i=i/5;
		if(i==1)
			return true;
		return false;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int n=sc.nextInt();
	
	int i=1;
	int count=0;
	while(count<n)
	{
		i++;
		if(isUgly(i))
			count++;
	}
	System.out.println(n+"th ugly no is "+i);
	}

}
