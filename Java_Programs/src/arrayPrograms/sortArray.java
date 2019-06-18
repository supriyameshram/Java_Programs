package arrayPrograms;

import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the number you want in an array:");
		  int n = scan.nextInt();
		  int[] arr = new int[n];
		  System.out.println("Enter elements in an array:");
		  for(int i=0; i<n; i++)
		  {
		    arr[i] = scan.nextInt();
		  }
		  scan.close();
		  for(int i=0; i<n; i++)
		  {
		    for(int j=i+1; j<n;j++)
		    {
		      if(arr[i]>arr[j])
		      {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		      }
		    }
		  }
		  
		  System.out.println("Elements after sorting:");
		  for(int i=0; i<n; i++)
		  {
		    System.out.println(arr[i]);
		  }

	}

}
