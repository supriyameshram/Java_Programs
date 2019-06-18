package basic_Java;

import java.util.Arrays;

public class TwoArraysEquality {

	public static void main(String[] args) {
		int[] arrayOne = {21, 57, 11, 37, 24};
		int[] arrayTwo = {21, 57, 11, 37, 24};
		boolean equalorNot = true;
		
		if(arrayOne.length == arrayTwo.length)
		{
			for(int i=0;i<arrayOne.length;i++)
			{
				if(arrayOne[i]!=arrayTwo[i])
				{
					equalorNot = false;
				}
			}
		}
		else
		{
			equalorNot = false;
		}
		System.out.println("Input arrays: ");
		System.out.println("First Array: "+Arrays.toString(arrayOne));
		System.out.println("Second Array: "+Arrays.toString(arrayTwo));
		if(equalorNot)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}

	}

}
