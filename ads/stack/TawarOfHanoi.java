package ads.stack;

public class TawarOfHanoi {

	public void TawarOfHanoi(int n,char from,char des,char aux)
	{
		if(n==1)
		{
			System.out.printf("Move disk 1 from %c to %c \n",from,des);
			return;
		}
		TawarOfHanoi(n-1,from,aux,des);
		System.out.printf("Move disk %d from %c to %c \n ",n,from,des);
		TawarOfHanoi(n-1,aux,des,from);
		
	}
	public static void main(String[] args) {
		TawarOfHanoi tw=new TawarOfHanoi();
		tw.TawarOfHanoi(3,'A','C','B');

	}

}
// 1. if n=1 move disk from source to des using aux
// 2. if n>1 move n-1 from source to aux using des
// 3. move disk from source to des
// 4. move n-1 disks from aux to des using source