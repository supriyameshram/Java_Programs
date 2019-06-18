package arrayPrograms;

import java.util.Scanner;

public class insertElementArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[50];
		System.out.println("Enter array size: ");
		int size = scan.nextInt();
		System.out.println("Enter array elements ");
		for(int i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter Element to Insert :");
		int insert = scan.nextInt();
		
		System.out.println("At Which Position ? (Enter index number) :");
		int pos = scan.nextInt();
		scan.close();
		
		for(int i=size; i>pos; i--)
		{
			arr[i] = arr[i-1];
		}
		
		arr[pos] = insert;
		System.out.println("Element inserted successfully!!!");
		System.out.println("Now the new array is: \n");
		for(int i=0; i<size+1; i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}

}
