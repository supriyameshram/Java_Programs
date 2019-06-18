package basic_Java;

import java.util.Arrays;

public class ContinuousSubArray {

	static void findSubArray(int[] inputArray, int inputNumber)
	{
		int i=0;
		
		int sum = inputArray[0];
		
		int start = 0;
		
		for(i=1;i<inputArray.length;i++)
		{
			sum = sum - inputArray[start];
			
			start++;
		}
		
		if(sum == inputNumber)
		{
			System.out.println("Input Array :"+Arrays.toString(inputArray));
			System.out.println("Input Array :"+inputNumber);
			System.out.println("Continuous Sub Array : ");;
			for(int j = start;j<=i;j++)
			{
				System.out.print(inputArray[j]+" ");
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
	
		findSubArray(new int[] {42, 15, 12, 8, 6, 32}, 26);
		findSubArray(new int[] {12, 5, 31, 13, 21, 8}, 49);
	}

}
