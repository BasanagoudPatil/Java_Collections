package List;

import java.util.ArrayList;
import java.util.List;

public class Accessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing list.
		List<String> list=new ArrayList<>();
						
		//Adding elements to list
		list.add("java");
		list.add("HTML");
		list.add("CSS");
		list.add("MySQL");
						
		//Displaying list.
		System.out.println(list);
				
		//Accessing 0th index element..
		String first=list.get(0);
		System.out.println("\n0th index element is: \n"+first);
				
	}

}
