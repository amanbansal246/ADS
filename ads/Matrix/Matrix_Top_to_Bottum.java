package ads.Matrix;

public class Matrix_Top_to_Bottum {
	public static void show(int sr,int sc,int dr,int dc,int flag)
	{
		if(sr>dr)
			return;
		if(flag==1)
		{
			for(int i=1;i<=dc;i++)
				System.out.print(sr +""+ i+" ");
		}else
		{
			for(int i=dc;i>=0;i--)
				System.out.print(sr +""+ i+" ");
		}
		
		show(sr+1,sc,dr,dc,-flag);
	}
	public static void main(String[] args) {
		show(1,1,5,5,1);
	}

}
