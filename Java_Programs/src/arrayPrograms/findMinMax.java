package arrayPrograms;

import java.util.Scanner;

public class findMinMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many elements you want in an array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<n; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
		}
		
		System.out.println("Largest element in an array: "+max);
		System.out.println("Smallest element in an array: "+min);
 
	}

}
