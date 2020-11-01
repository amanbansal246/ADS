package ads.linkedlist;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class LInkedListUsingCollection {

	public static void getTime(List<Integer> l)
	{
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			l.add(0,i); //insert at 0th index
		}
		long end=System.currentTimeMillis();
		System.out.println(l.getClass().getName()+" --> "+(end-start));
	}
	public static void main(String[] args) {
	List<Integer> al=new ArrayList<>();
	List<Integer> li=new LinkedList<>();
	
	getTime(al);
	getTime(li);
	

	

	}

}
