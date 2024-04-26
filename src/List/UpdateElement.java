package List;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {

	public static void main(String[] args) {
		//Initializing list interface.
		List<String> list=new  ArrayList<>();
		
		//Adding elements to list.
		list.add("C");
		list.add("Java");
		list.add("python");
		list.add("HTML");
		
		//Displaying list.
		System.out.println("Initial array list: \n"+list);
		
		//Updating list element.
		list.set(3, "C++");
		
		//Displaying updated list.
		System.out.println("\nUpdated list Array: \n"+list);
		
		
	}

}
