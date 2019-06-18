package arrayPrograms;

import java.util.Scanner;

public class deleteElementsinArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int count=0;
		System.out.println("Enter array elements ");
		for(int i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter elements to be Delete :");
		int del = scan.nextInt();
		scan.close();
		
		for(int i=0; i<size; i++)
		{
			if(arr[i] == del)
			{
				for(int j=i; j<size-1; j++)
				{
					arr[j] = arr[j+1];
				}
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("Element not found!!");
		}
		
		else
		{
			System.out.println("Element Deleted Successfully");
			System.out.println("Now the New Array is: ");
			for(int i=0;i<size-1;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}

	}

}
