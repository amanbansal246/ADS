package ads.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args)
	{
		//-------------------UNION-------------------------------------
		Set<Integer> x=new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		Set<Integer> y=new HashSet<>();
		x.add(3);
		x.add(1);
		x.add(16);
		x.addAll(y); //union of set x and set y..add value of y to x 
		System.out.println(x);
		
		//-------------------INTERSECTION-----------------------------
		
		Set<Integer> x1=new HashSet<>();
		x1.add(23);
		x1.add(1);
		x1.add(6);
		Set<Integer> y1=new HashSet<>();
		y1.add(3);
		y1.add(1);
		y1.add(6);
		x1.retainAll(y1); //intersection of set x and set y..add value in x which are in x and y both
		System.out.println(x1);
		
		//-------------------SUBSET---------------------------	
		
		Set<Integer> x2=new HashSet<>();
		x2.add(23);
		x2.add(1);
		x2.add(6);
		x2.add(16);
		x2.add(06);
		Set<Integer> y2=new HashSet<>();
		y2.add(23);
		y2.add(1);
		y2.add(6);
		 //if y2 is a subset of x2..mean all the elements of y2 are in x2 then true
		System.out.println(x2.containsAll(y2));
		
	
	}
}
