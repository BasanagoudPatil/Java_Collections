package List;

import java.util.ArrayList;
import java.util.List;

public class IteratingTheElements {

	public static void main(String[] args) {
		//Initialize list.
		List<String> list=new ArrayList<>();
				
		//Adding elements to list.
		list.add("Tata");
		list.add("Infosys");
		list.add("Wipro");
		list.add("HCL");
				
		//Displaying list.
		System.out.println(list+"\n");  
		
		System.out.println(list.hashCode());
		//Iterating the elements.
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println();
		//Another method to iterate elements.
		for(String e:list)
		{
			System.out.println(e);
		}
	}

}
