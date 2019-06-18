package basic_Java;

import java.util.Scanner;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		System.out.println("enter the nmber of elements you want in string array:");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] str = new String[N];
		System.out.println("Enetr string elemnts:");
		for(int i=0;i<=N;i++)
		{
			str[i]=scan.nextLine();
		}
		scan.close();
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(str[i].equals(str[j]) && i!=j)
				{
					System.out.println("Duplicate elements in an array:" +str[j]);
				}
			}
		}
		

	}

}
