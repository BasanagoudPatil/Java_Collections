package List;
import java.util.*;

public class ElementPresentOrNot {

	public static void main(String[] args) {
		//Initialize list.
		List<String> list=new ArrayList<>();
		
		//Adding elements to list.
		list.add("Tata");
		list.add("Infosys");
		list.add("Wipro");
		list.add("HCL");
		
		//Displaying list.
		System.out.println(list);
		
		//Check element present or not.
		boolean check=list.contains("HCL");
		System.out.println("\nHCL is present in list: \n"+check);
		
		//Check invalid value is present or not.
		check=list.contains("Google");
		System.out.println("\nGoogle is present in list: \n"+check);
	}

}
