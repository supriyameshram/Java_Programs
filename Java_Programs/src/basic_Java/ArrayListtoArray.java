package basic_Java;

import java.util.ArrayList;

public class ArrayListtoArray {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("JSP");
		list1.add("Android");
		list1.add("Struts");
		list1.add("Hadoop");
		list1.add("JSP");
		
		String[] array = new String[list1.size()];
		list1.toArray(array);
		for(String string : array)
		{
			System.out.println(string);
		}
		
	}

}
