package HashMap;

import java.util.HashMap;

public class CreatingHashMap {

	public static void main(String[] args) {
		
		//Creating an empty HashMap By declaring object of String and Integer type.
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		//Adding values to hm(HashMap).
		hm.put("Tata punch", 1000000);
		hm.put("Tata nexon", 1300000);
		hm.put("Tata Indica", 700000);
		hm.put("Tata tiago", 800000);
		
		//Printing keys and values present in hm(HashMap).
		System.out.println(hm);
		
	}

}
