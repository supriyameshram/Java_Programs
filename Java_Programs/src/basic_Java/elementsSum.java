package basic_Java;

import java.util.Arrays;

public class elementsSum {

	public static void findThePairs(int inputArray[], int inputNumber)
	{
		System.out.println("Input Array : " +Arrays.toString(inputArray));
		System.out.println("Input Number: "+inputNumber);
		
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i+1;j<inputArray.length;j++)
			{
				if(inputArray[i]+inputArray[j] == inputNumber)
				{
					System.out.println(inputArray[i]+ "+"+inputArray[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		findThePairs(new int[] {4, -5, 11, 25, 13, 12, 8},20);
		

	}

}
