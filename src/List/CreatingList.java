package List;

import java.util.ArrayList;
import java.util.List;

public class CreatingList {

	public static void main(String[] args) {
		//Creating an list interface and implemented by ArrayList.
		List<Integer> list=new ArrayList<>();
		
		//Adding values to list.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//Displaying list values.
		System.out.println("List values:\n"+list);
		}
}
