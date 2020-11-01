package ads.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListSimple {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList(); //without generics //with default size 10
		ar.add("aman"); //add String data type
		ar.add(123);   //add int data type
		ar.add(true);  //add boolean data type

		ArrayList<String> ar1=new ArrayList();
		ar1.add("Aman"); //can add only String data type 
		//ar1.add(123);   //error
		
		//System.out.println(ar.ensureCapacity(minCapacity);
		//There is no direct way to check ArrayList capacity. 
		System.out.println(ar.size());
		 
		ArrayList<Integer> ar2=new ArrayList<>(6); //intial capacity
		ar2.add(2);
		ar2.add(4);
		ar2.add(6);
		ar2.add(8);
		ar2.add(10);
		System.out.println(ar2.size());
		ar2.add(8);
		ar2.add(10);//now size will increase autometically
		System.out.println(ar2.size());
		
		//ar2.ensureCapacity(minCapacity); Increases the capacity of this ArrayList instance, 
		//if necessary, to ensure that it can hold at least the number of elements specified by 
		//the minimum capacity argument.
		
		//ar2.trimToSize(); suppose size is 10 and we have only 4 element then we can save 
		//remain 6 places by this this will trim capacity to size
		
		List<String> fruits=new ArrayList<>();
		List<String> vegetables=new LinkedList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("oranges");
		fruits.add("Grapes");
		
		vegetables.add("potato");
		vegetables.add("tomato");
		vegetables.add("onion");
		
		System.out.println(fruits);
		System.out.println(vegetables);
		fruits.addAll(vegetables);  //addAll() method
		System.out.println(fruits);
		System.out.println(vegetables.get(0));  //get() method ,if out of index then throw indexOutOfBounds

		//toArray() mehtod conver arraylist in array of obejct type
		Object []x=fruits.toArray();
		
		//if we want specific type array then we have another method
		//toArray(object)  it is overloaded mehtod
		
		String []ar11=new String[fruits.size()]; //first create array of string type
		fruits.toArray(ar11);  //pass array obj to toArray()
		 	
		
	}

}
