package List;

import java.util.ArrayList;
import java.util.List;

public class Removing {

	public static void main(String[] args) {
		//Initializing list.
		List<String> list=new ArrayList<>();
				
		//Adding elements to list
		list.add("java");
		list.add("HTML");
		list.add("CSS");
		list.add("MySQL");
				
		//Displaying list.
		System.out.println(list);
		
		//removing index element.
		list.remove(1);
		System.out.println("\nRemoved value present at index 1 \n"+list);
		
		//Removing element in list.
		list.remove("CSS");
		System.out.println("\nRemoved CSS element in list :\n"+list);
	}

}
