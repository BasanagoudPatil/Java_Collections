package List;

import java.util.ArrayList;
import java.util.List;

public class OperationsOnList {

	public static void main(String[] args) {
		
		/*Creating an object of the list interface and implemented 
		 * by the ArrayList class*/
		List<Integer> list1=new ArrayList<Integer>();
		
		//Adding values to list1 interface.
		list1.add(1);
		list1.add(2);
		
		//printing list1 values.
		System.out.println("List values\n"+list1);
		
		//Creating another list interface implemented by ArrayList class.
		List<Integer> list2=new ArrayList<Integer>();
		
		//Adding values to list2 interface.
		list2.add(3);
		list2.add(4);
		
		//printing list2 values
		System.out.println("\nList2 values\n"+list2);
		
		//Adding list2 values from list1.
		list1.addAll(list2);
		
		//Print updated list1 values
		System.out.println("\nList1 and List2 values in list1\n"+list1);
		
		//Removing 0th index value in list1.
		list1.remove(0);
		
		//Printing updated list1 values.
		System.out.println("\n0th index removed from list1\n"+list1);
		
		//Printing 0th index value from list1.
		System.out.println("\n0th index value in list1\n"+list1.get(0));
		
		//Changing 0th index value as 1.
		list1.set(0, 1);
		
		//Printing updated list1 values.
		System.out.println("\n0th index changed as 1 in list1\n"+list1);

		//Note: \n is used for jumping into a new line.
	}

}
