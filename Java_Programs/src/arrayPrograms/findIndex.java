package arrayPrograms;

import java.util.Scanner;

public class findIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want in an array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
		{
			arr[i] =  scan.nextInt();
		}
		System.out.println("Enter the element to find the location of it");
		int element = scan.nextInt();
		scan.close();
		
		for(int i=0; i<n; i++)
		{
			if(element == arr[i])
			{
				System.out.println("Element is present at location " +i);
			}
		}
	}

}
