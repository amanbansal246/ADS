package ads.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUsingCollection {

	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>(); //no ordering..store value in random order
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Guava");
		System.out.println(fruits);
		fruits.add("Banana");//duplicate value
		System.out.println(fruits);
		
		Set<String> f1 = new LinkedHashSet<>(); //ordering preserve ...store value in sequencial order..linkedlist implementation
		f1.add("Apple");
		f1.add("Kiwi");
		f1.add("Banana");
		System.out.println(f1);
		
		Set<String> f2=new TreeSet<>(); //store in sorted order..internally binary tree implementation
		f2.add("Banana");
		f2.add("Apple");
		f2.add("Grapes");
		f2.add("Payaya");
		System.out.println(f2);
	}

}
