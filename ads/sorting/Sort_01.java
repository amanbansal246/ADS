package ads.sorting;

public class Sort_01 {
	public static void main(String[] args) {
		int a1[]= {1,1,0,1,0,1,1,0,1,0,0,0,1};
		int i=0;
		int j=0;
		
		while(i!=a1.length)
		{
			if(a1[i]==1) {
				i++;
			}
			else 
			{
				int temp=a1[i];
				a1[i]=a1[j];
				a1[j]=temp;
				
				j++;
				i++;
			}
			
		}
		
		for(int l =0;l<a1.length;l++)
			System.out.print(a1[l]+" ");

	}

}
