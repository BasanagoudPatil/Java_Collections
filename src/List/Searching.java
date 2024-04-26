package List;

import java.util.ArrayList;
import java.util.List;

public class Searching {

	public static void main(String[] args) {
		//Initializing list.
		List<Integer> list=new ArrayList<>();
		
		//Adding elements to list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		
		//Displaying list.
		System.out.println(list);
		
		//searching element in list.
		int index=list.indexOf(2);
		System.out.println("\nFirst occerance of 2 at index: "+index);
		
		//Searching last index.
		int LastIndex=list.lastIndexOf(2);
		System.out.println("Last occerance of 2 at index: "+LastIndex);

		
		
	}

}
