package ads.recursion;
import java.util.Scanner;
public class N_number {
	public void displayReverse(int n)
	{
		if(n==0)return;
		
		System.out.print(n+ " ");
		display(n-1);
	}
	public void display(int n)
	{
		if(n==0)return;
		
		display(n-1);
		System.out.print(n+ " ");
	}
	public void pdi(int n)
	{
		if(n==0)return;
		
		System.out.print(n+" ");
		pdi(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		N_number dp=new N_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		dp.display(n);
		System.out.println();
		dp.displayReverse(n);
		System.out.println("h");
		dp.pdi(n);
	}

}
