package basic_Java;

import java.util.Scanner;

public class CalculateLength {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		System.out.println("Length of the string is :" + length(s));		
	}
	
	private static int length(String str)
	{
		if(str.equals(""))
			return 0;		
		else
			return length(str.substring(1))+1;
			
	}

}
