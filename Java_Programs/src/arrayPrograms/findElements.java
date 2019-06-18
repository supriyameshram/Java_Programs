package arrayPrograms;

import java.util.Scanner;

public class findElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want array elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element you want to find in an array:");
		int element = scan.nextInt();
		scan.close();
		boolean flag = false;
		
		for(int x: arr)
		{
			if(element == x)
			{
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
