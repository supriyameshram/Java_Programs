package basic_Java;

import java.util.Arrays;

public class ReverseArrayWithoutUsingAdditionalArray {

	
	static void reverseArray(int inputArray[])
	{
		System.out.println("Arrays befor reverse: " +Arrays.toString(inputArray));
	
	    int temp=0;
	for(int i = 0; i<inputArray.length/2;i++)
	{
		temp = inputArray[i];
		inputArray[i] = inputArray[inputArray.length-1-i];
		inputArray[inputArray.length-1-i] = temp;	
	}
	System.out.println("Array after reverse "+Arrays.toString(inputArray));
	}
	
	
	
	public static void main(String[] args)
	{
	reverseArray(new int[] {4, 5, 8, 9, 10});
}
}