package HashMap;

import java.util.HashMap;

public class OperationsOnHashMap {

	public static void main(String[] args) {
		//Initializing HashMap.
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		
		//Adding values to HashMap.
		hash.put("Basu",987);
		hash.put("Anand",324);
		
		//Printing values stored in HashMap.
		System.out.println("HashMap values:\n\t"+hash);
		
		//Change value using put method.
		hash.put("Basu",123);
				
		//Displaying updated values.
		System.out.println("\nUpdated HashMap values:\n\t"+hash);
		        
		
		//Using hash.size() method to printing HAshMap size.
		System.out.println("\nHashMap size:\n\t"+hash.size());
		
		//Accessing values using get() method.
		System.out.println("\nvalue of key Basu is:\n\t"+hash.get("Basu"));
		
		//Checking a value is present in HashMap.
		System.out.println("\nValue Basu is present:\n\t"+hash.containsKey("Basu"));
        
		//Removing value from HashMap.
		hash.remove("Basu");
		System.out.println("\n----Value Basu is removed from HashMap----");
		
		//Checking value present or not in updated HashMap.
		System.out.println("\nAfter udating HashMap Basu value is present:\n\t"+hash.containsKey("Basu"));
		
		//Getting updated HashMap size.
		System.out.println("\nUpdated HashMap size:\n\t"+hash.size());
		
		
		//\n is used for jump to new line.
		//\t represents a tab.

	}

}
