package basic_Java;

import java.util.Scanner;

public class Calculate_Length {
	public static void main(String[] args)
	{
		String str;
		int count=0;
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();	
		str = str + '\0';
		scan.close();
		for(int i=0; str.charAt(i)!='\0';i++)
		{
			count++;
		}
		System.out.println(count);
		
	}

}
