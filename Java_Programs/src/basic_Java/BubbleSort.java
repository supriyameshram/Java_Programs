package basic_Java;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements youn want in your array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array elements:" );
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
