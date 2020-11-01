package ads.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapUsingCollection {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("one",1);
		mp.put("two",2);
		mp.put("three",3);
		mp.put("four",4);
		mp.put("five",5);
		
		mp.put("three",30); //this will override old value
		System.out.println(mp);
		
		Map<String,Integer> mp1=new HashMap<>();
		mp1.put("apple",40);
		mp1.put("banana",20);
		mp1.put("guava",35);
		
		mp.putAll(mp1); //add mp1 hashmap in mp
		System.out.println(mp);
		System.out.println(mp.get("apple"));
		
		mp.remove("banana");
		System.out.println(mp);
		
		mp.putIfAbsent("guava", 60); //if guava key is not already there then only inserted
		System.out.println(mp);

		System.out.println(mp.values());  //get all values 
		System.out.println(mp.keySet()); // get all keys

		System.out.println("Entry set");
		System.out.println(mp.entrySet());//we can see this as array of key and value
		
		//iterate hashmap
		for(Entry<String,Integer> entry:mp.entrySet()) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(mp);
	}

}
