package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class TraversalTheHashMap {

	public static void main(String[] args) {
		//Initializing HashMap.
		HashMap<Integer,String> hm=new HashMap<>();
		
		//Adding values to HashMap.
		hm.put(1,"Rashmi");
		hm.put(2,"Sharadha");
		hm.put(3,"Veer");
		
		//Iterate the map using for loop.
		for(Entry<Integer,String> e:hm.entrySet())
		{
			//Using getKey() and getValue() method to call keys and values from HashMap.
			System.out.println(e.getKey()+" value is: "+e.getValue());
		}
		
		
		
		
	}

}
