package ads.Matrix;
import java.util.Scanner;
public class Matrix_shall_rotate {

	public static void rotateShell(int arr[][],int s,int r)
	{
		int[] oned=fillOneFromShell(arr,s);
		rotate(oned,r);
		fillShellFromOned(arr,s,oned);
	}
	public static int[] fillOneFromShell(int [][]arr,int s)
	{
		int minr=s-1;
		int minc=s-1;
		int maxr=arr.length-s;
		int maxc=arr[0].length-s;
		int sz=2*(maxr-minr+maxc-minc); //no of ele in shell
		
		int[] oned=new int[sz];
		int idx=0;
		//lw
		for(int i=minr,j=minc;i<=maxr;i++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		//bw
		for(int i=maxr,j=minc+1;j<=maxc;j++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		//rw
		for(int i=maxr-1,j=maxc;i>=minr;i--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		//uw
		for(int i=minr,j=maxc-1;j>=minc+1;j--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}
		
		return oned;
	}
	public static void fillShellFromOned(int arr[][],int s,int[] oned)
	{
		int minr=s-1;
		int minc=s-1;
		int maxr=arr.length-s;
		int maxc=arr[0].length-s;
		
		int idx=0;
		//lw
		for(int i=minr,j=minc;i<=maxr;i++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//bw
		for(int i=maxr,j=minc+1;j<=maxc;j++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//rw
		for(int i=maxr-1,j=maxc;i>=minr;i--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//uw
		for(int i=minr,j=maxc-1;j>=minc;j--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		
	}
	public static void rotate(int []oned,int r)
	{
		r=r % oned.length;
		if(r<0)
			r=r + oned.length;
		reverse(oned,0,oned.length-r-1 );
		reverse(oned,oned.length-r,oned.length-1);
		reverse(oned,0 ,oned.length-1 );
	}
	
	public static void reverse(int []oned,int li,int ri)
	{
		while(li<ri)
		{
			int temp=oned[li];
			oned[li]=oned[ri];
			oned[ri]=temp;
			li++;
			ri--;
		}
	}
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int arr[][]= {{1,2,3,4,5},{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45}};
		System.out.println("Enter shell no");
		int s=sc.nextInt();
		System.out.println("Enter no of rotation");
		int r=sc.nextInt();
		
		rotateShell(arr,s,r);
		display(arr);
	}

}
