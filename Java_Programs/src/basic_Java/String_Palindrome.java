package basic_Java;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		scan.close();
		strPalindrom(str);
		
	}
	static void strPalindrom(String str)
	{
		char ch[] = str.toCharArray();
		int count = ch.length-1;
		for(int i=0; i<ch.length; i++, count--)
		{
			if (ch[i] != ch[count])
			{
				System.out.println("String is not Palindrome");
				break;
			}
			else
			{
				if(i==count)
				{
					System.out.println("String is palindrome");
				}
			}
		
		}
	}

}
