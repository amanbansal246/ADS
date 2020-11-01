package ads.sorting;

public class Sort_dates {
	public static void radixSort(String date[],int div,int exp,int range)
	{
		String[] ans=new String[date.length];
		int farr[]=new int[range];
		
		for(int i=0;i<date.length;i++)
		{
			farr[Integer.parseInt(date[i],10)/div % exp]++;
		}
		for(int i=1;i<date.length;i++)
		{
			farr[i]=farr[i]+farr[i-1];
		}
		
		for(int i=ans.length-1;i>=0;i--)
		{
			int pos=farr[Integer.parseInt(date[i],10)/div%exp]-1;
			ans[pos]=date[i];
			farr[Integer.parseInt(date[i],10)/div%exp]--;
		}
		
		for(int i=1;i<ans.length;i++)
			date[i]=ans[i];
	}	
	public static void main(String[] args) {
		String date []= {"12041996","20101996","12041989","11081987","15061995"};
		radixSort(date,1000000,100,32);//dates
		radixSort(date,10000,100,13);//months
		radixSort(date,1,10000,2501);//year ..year would not be more than 2500 according to question
		
		for(String str:date)
			System.out.println(str);
	}

}
