package basic_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] array = {"Android", "ASP", "Java", "Struts", "Hadoop", "JSP"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		System.out.println(list);
		

	}

}
