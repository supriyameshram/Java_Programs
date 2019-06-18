package basic_Java;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	

	}

}
