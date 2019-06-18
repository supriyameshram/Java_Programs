package basic_Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String rev="";
		int length = str.length();
		scan.close();
		for(int i=length-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("string is not palindrome");

	}

}
