package basic_Java;

import java.util.Scanner;

public class NumberofWords {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		scan.close();
		String[] words = str.trim().split(" ");
		System.out.println("Number of words in a string : " +words.length);
		
		

	}

}
