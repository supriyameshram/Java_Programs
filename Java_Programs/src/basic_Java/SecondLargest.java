package basic_Java;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	
	static void secondLargest(int[] arr)
	{
		int firstLargest, secondLargest;
		if(arr[0]>arr[1])
		{
		firstLargest = arr[0];
		secondLargest = arr[1];
		}
		else
		{
			firstLargest = arr[1];
			secondLargest = arr[0];
			
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = arr[i];			
			}
			else if(arr[i]<firstLargest && arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}
		
		System.out.println("Input array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest Element:");
		System.out.println(firstLargest);
		System.out.println("Second Largest Element:");
		System.out.println(secondLargest);
	}
	
	

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i] = scan.nextInt();
		}
		scan.close();
		secondLargest(arr1);
		

	}

}
